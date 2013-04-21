<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View Manager</title>
<link REL="stylesheet" type="text/css" href="../alleyStyle.css">
</head>

<body style="border:1; background-color:white;">
	<div id="popUpTitleDiv" >
		<b>뷰 정보 관리</b>
	</div>
	<p>	
	
	<form id="vuForm" >
	<!--  페이지 오픈시에는 조회 모드이다.  -->
	<input type="hidden" id="serviceName" name="serviceName" value="admin.SelectVuById" >

	<table>
	<tr>
		<td>ID</td>
		<td align="left"><input readonly type="text" id="vuId"  name="vuId" size="10" value=<%=request.getParameter("vuId")%> ></td>
	</tr>
	<tr>
		<td>View 명</td>
		<td align="left"><input type="text" id="vuNm"  name="vuNm" size="40"></td>
	</tr>
	<tr>
		<td>등록일</td>
		<td align="left"><input type="text" id="vuRegDt"  name="vuRegDt" size="10"></td>
	</tr>
	<tr>
		<td>File Path</td>
		<td align="left"><input type="text" id="vuFilePath"  name="vuFilePath" size="40"></td>
	</tr>
	<tr>
		<td>설 명</td>
		<td align="left">
			<textarea id="vuNote"  name="vuNote" rows="5" cols="40"></textarea>
		</td>
	</tr>
	</table>
	<p>
	<div style="background-color:white; text-align:right; ">
		<button id="updateClose" type="button" >저장후 닫기</button>
		<button id="update" type="button" >저장</button>
		<button id="delete" type="button" >삭제</button>
		<button id="close" type="button" >닫기</button>
	</div>
		
	</form>
</body>

<script type="text/javascript" src="../js/jquery-1.7.2.js"></script>
<script type="text/javascript" >

$(document).ready(function(){

	if($("#vuId").val() > 0){
		$.getJSON("../service.jsp", $("#vuForm").serialize(), function(json) {

			if(json.code < 0){
				// 조회시 오류 발생 
				alert(json.message);
				return false; 
			}
			$("#vuId").val(json.data.vuId);
			$("#vuNm").val(json.data.vuNm);
			$("#vuRegDt").val(json.data.vuRegDt);
			$("#vuFilePath").val(json.data.vuFilePath);
			$("#vuNote").val(json.data.vuNote) ;

			// 조회후에는 저장모드로 변경한다.(서비스 클래스명을 변경한다.) 
			$("#serviceName").val("admin.UpdateVu");
		});
	}
	else {
		// 회사자료 등록  
		$("#serviceName").val("admin.InsertVu");
	}; 

	$("#delete").click(function(evnt) {
		// 삭제를 위한 서비스명을 변경한다.  
		$("#serviceName").val("admin.DeleteVu");
		$.getJSON("../service.jsp", $("#vuForm").serialize(), function(json) {
			alert(json.message);
			parent.closeFrame();
			return false; 
		}); 
	}); 

	$("#close").click(function(evnt) {
		parent.closeFrame(); 
	}); 

	$("#update").click(function(event) {
		updateVu(); 	
	}); 
	
	$("#updateClose").click(function(event) {
		updateVu(); 
		parent.closeFrame(); 
	}); 
});

function updateVu(){
	// service Name을 Update로 변경한다. 	
	// admin.UpdateVu 서비스 클래스 호출 
	
	$.getJSON("../service.jsp", $("#vuForm").serialize(), function(json) {
		if(json.code > 0 ){ 
			alert("자료가 저장되었습니다");
		}
		else {
			alert(json.message + "\nerror code : " + json.code);
		}
	}) 
	.error(function() {
	    alert("서비스 호출 오류가 발생하였습니다.");
	});
	return false ;
};
</script>          
</html>