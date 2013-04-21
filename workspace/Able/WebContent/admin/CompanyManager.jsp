<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update Company</title>
<link REL="stylesheet" type="text/css" href="../alleyStyle.css">
</head>

<body style="border:1; background-color:white;">
	<div id="popUpTitleDiv" >
		<b>회사 정보</b>
	</div>
	<p>	
	
	<form id="comForm" >
	<!--  페이지 오픈시에는 조회 모드이다.  -->
	<input type="hidden" id="serviceName" name="serviceName" value="admin.SelectComById" >

	<table>
	<tr>
		<td>번호</td>
		<td align="left"><input type="text" id="comId"  name="comId" size="10" value=<%=request.getParameter("comId")%> ></td>
	</tr>
	<tr>
		<td>회사명</td>
		<td align="left"><input type="text" id="comLocNm"  name="comLocNm" size="40"></td>
	</tr>
	<tr>
		<td>법인번호</td>
		<td align="left"><input type="text" id="comBizNo"  name="comBizNo" size="30"></td>
	</tr>
	<tr>
		<td>영문명</td>
		<td align="left"><input type="text" id="comEngNm"  name="comEngNm" size="60"></td>
	</tr>
	<tr>
		<td>창립기념일</td>
		<td align="left"><input type="text" id="comAnnivDt"  name="comAnnivDt" size="10"></td>
	</tr>
	<tr>
		<td>대표자성명</td>
		<td align="left"><input type="text" id="comCeoNm"  name="comCeoNm" size="30"></td>
	</tr>
	<tr>
		<td>설 명</td>
		<td align="left">
			<textarea id="comNote"  name="comNote" rows="5" cols="40"></textarea>
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

	if($("#comId").val() > 0){
		$.getJSON("../service.jsp", $("#comForm").serialize(), function(json) {

			if(json.code < 0){
				// 조회시 오류 발생 
				alert(json.message);
				return false; 
			}
			$("#comId").val(json.data.comId);
			$("#comLocNm").val(json.data.comLocNm);
			$("#comBizNo").val(json.data.comBizNo);
			$("#comEngNm").val(json.data.comEngNm);
			$("#comAnnivDt").val(json.data.comAnnivDt);
			$("#comCeoNm").val(json.data.comCeoNm);
			$("#comNote").val(json.data.comNote) ;

			// 조회후에는 저장모드로 변경한다.(서비스 클래스명을 변경한다.) 
			$("#serviceName").val("admin.UpdateCom");
		});
	}
	else {
		// 회사자료 등록  
		$("#serviceName").val("admin.InsertCom");
	}; 

	$("#delete").click(function(evnt) {
		// 삭제를 위한 서비스명을 변경한다.  
		$("#serviceName").val("admin.DeleteCom");
		$.getJSON("../service.jsp", $("#comForm").serialize(), function(json) {
			alert(json.message);
			parent.closeFrame();
			return false; 
		}); 
	}); 

	$("#close").click(function(evnt) {
		parent.closeFrame(); 
	}); 

	$("#update").click(function(event) {
		updateCom(); 	
	}); 
	
	$("#updateClose").click(function(event) {
		updateCom(); 
		parent.closeFrame(); 
	}); 
});

function updateCom(){
	// service Name을 Update로 변경한다.
	// admin.UpdateCom 서비스 클래스 호출 
	
	$.getJSON("../service.jsp", $("#comForm").serialize(), function(json) {
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