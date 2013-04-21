<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Role관리</title>
	<link REL="stylesheet" type="text/css" href="../alleyStyle.css">
</head>

<body style="border:1; background-color:white;">
	<div id="popUpTitleDiv" >
		<b>Role 정보</b>
	</div> 
	<p>	
	<form id="roleForm" >
		<input type="hidden" id="serviceName" name="serviceName" value="admin.SelectRoleById" >
		<table>
		<tr>
			<td align="left"><input readonly type="text" id="roleId"  name="roleId" size="10" value=<%=request.getParameter("roleId")%>></td>
		</tr>
		<tr>
			<td>Role명</td>
			<td align="left"><input type="text" id="roleNm"  name="roleNm" size="40"></td>
		</tr>
		<tr>
			<td>등록일</td>
			<td align="left"><input type="date" id="roleRegDt"  name="roleRegDt" size="60"></td>
		</tr>
		<tr>
			<td>설 명</td>
			<td align="left">
				<textarea id="roleNote"  name="roleNote" rows="5" cols="40"></textarea>
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
	
	if($("#roleId").val() > 0 && $("#roleId").val() != null){
		// roleID가 넘어왔으면 조회한다. 
		$.getJSON("../service.jsp", $("#roleForm").serialize(), function(json) {

			if(json.code < 0){
				// 조회시 오류 발생 
				alert(json.message);
				return false; 
			}
			
			//alert(json.data.roleNm); 
			$("#roleNm").val(json.data.roleNm);  
			$("#roleRegDt").val(json.data.roleRegDt);
			$("#roleNote").val(json.data.roleNote);
	
			// 조회후에는 저장모드로 변경한다.(서비스 클래스명을 변경한다.) 
			$("#serviceName").val("admin.UpdateRole");
		});
	}
	else {
		// 등록 모드 
		$("#serviceName").val("admin.InsertRole");
	}; 

	$("#delete").click(function(evnt) {
		// 삭제를 위한 서비스명을 변경한다.  
		$("#serviceName").val("admin.DeleteRole");
		$.getJSON("../service.jsp", $("#roleForm").serialize(), function(json) {
			alert(json.message);
			parent.closeFrame();
			return false; 
		}); 
	}); 

	$("#close").click(function(evnt) {
		parent.closeFrame(); 
	}); 

	$("#update").click(function(event) {
		updateRole(); 	
	}); 
	
	$("#updateClose").click(function(event) {
		updateRole(); 
		parent.closeFrame(); 
	}); 
});

function updateRole(){
	$.getJSON("../service.jsp", $("#roleForm").serialize(), function(json) {
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

