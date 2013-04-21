<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>계약관리</title>
	<link REL="stylesheet" type="text/css" href="../alleyStyle.css">
</head>

<body style="border:1; background-color:white;">
	<div id="popUpTitleDiv" >
		<b>계약정보</b>
	</div> 
	<p>	
	
	<form id="contrForm" >
	<input type="hidden" id="serviceName" name="serviceName" value="admin.SelectContrById" >

	<table>
	<tr>
		<td align="left"><input readonly type="text" id="comId"  name="comId" size="10" value=<%=request.getParameter("comId")%>></td>
		<td align="left"><input readonly type="text" id="contrId"  name="contrId" size="10" value=<%=request.getParameter("contrId")%>></td>
	</tr>
	<tr>
		<td>회사명</td>
		<td align="left"><input readonly type="text" id="comLocNm"  name="comLocNm" size="30"></td>
	</tr>
	<tr>
		<td>계약유형</td>
		<td align="left"><input type="text" id="contrTypeCd"  name="contrTypeCd" size="10"></td>
	</tr>

	<tr>
		<td>계약일</td>
		<td align="left"><input type="text" id="contrSignDt"  name="contrSignDt" size="10"></td>
	</tr>
	<tr>
		<td>계약명</td>
		<td align="left"><input type="text" id="contrNm"  name="contrNm" size="60"></td>
	</tr>
	<tr>
		<td>계약시작일</td>
		<td align="left"><input type="text" id="contrStartDt"  name="contrStartDt" size="10"></td>
	</tr>
	<tr>
		<td>계약종료일</td>
		<td align="left"><input type="text" id="contrCloseDt"  name="contrCloseDt" size="10"></td>
	</tr>
	<tr>
		<td>설 명</td>
		<td align="left">
			<textarea id="contrNote"  name="contrNote" rows="5" cols="40"></textarea>
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
	
	if($("#contrId").val() > 0 && $("#contrId").val() != null){
		// 계약ID가 넘어왔으면 조회한다. 
		$.getJSON("../service.jsp", $("#contrForm").serialize(), function(json) {

			if(json.code < 0){
				// 조회시 오류 발생 
				alert(json.message);
				return false; 
			}
			
			//alert(json.data.contrNm); 
			
			$("#contrId").val(json.data.contrId);
			$("#comLocNm").val(json.data.comModel.comLocNm); // 회사의 회사명 
			$("#contrTypeCd").val(json.data.contrTypeCd);
			$("#contrSignDt").val(json.data.contrStartDt);
			$("#contrNm").val(json.data.contrNm);
			$("#contrStartDt").val(json.data.contrStartDt);
			$("#contrCloseDt").val(json.data.contrCloseDt) ;
			$("#contrNote").val(json.data.contrNote) ;
			
			// 조회후에는 저장모드로 변경한다.(서비스 클래스명을 변경한다.) 
			$("#serviceName").val("admin.UpdateContr");
		});
	}
	else {
		
		// 회사명만 조회 
		$("#serviceName").val("admin.SelectComById");
		
		$.getJSON("../service.jsp", $("#contrForm").serialize(), function(json) {

			if(json.code < 0){
				// 조회시 오류 발생 
				alert(json.message);
				return false; 
			}
			$("#comLocNm").val(json.data.comLocNm); // 회사의 회사명 
		});
		
		// 계약신규 등록 모드 
		$("#serviceName").val("admin.InsertContr");
	}; 

	$("#delete").click(function(evnt) {
		// 삭제를 위한 서비스명을 변경한다.  
		$("#serviceName").val("admin.DeleteContr");
		$.getJSON("../service.jsp", $("#contrForm").serialize(), function(json) {
			alert(json.message);
			parent.closeFrame();
			return false; 
		}); 
	}); 

	$("#close").click(function(evnt) {
		parent.closeFrame(); 
	}); 

	$("#update").click(function(event) {
		updateContr(); 	
	}); 
	
	$("#updateClose").click(function(event) {
		updateContr(); 
		parent.closeFrame(); 
	}); 
});

function updateContr(){
	// service Name을 Update로 변경한다. 	
	// admin.UpdateCom 서비스 클래스 호출 
	
	$.getJSON("../service.jsp", $("#contrForm").serialize(), function(json) {
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