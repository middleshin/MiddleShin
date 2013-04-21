<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>메뉴관리</title>
	<link REL="stylesheet" type="text/css" href="../alleyStyle.css">
</head>

<body style="border:1; background-color:white;">
	<div id="popUpTitleDiv" >
		<b>메뉴정보</b>
	</div> 
	<p>	
	<form id="menuForm" >
		<input type="hidden" id="serviceName" name="serviceName" value="admin.SelectMenuById" >
		<table>
		<tr>
			<td align="left"><input readonly type="text" id="menuId"  name="menuId" size="10" value=<%=request.getParameter("menuId")%>></td>
		</tr>
		<tr>
			<td>메뉴명</td>
			<td align="left"><input type="text" id="menuNm"  name="menuNm" size="40"></td>
		</tr>
		<tr>
			<td>등록일</td>
			<td align="left"><input type="date" id="menuRegDt"  name="menuRegDt" size="60"></td>
		</tr>
		<tr>
			<td>정렬순서</td>
			<td align="left"><input type="date" id="menuSeq"  name="menuSeq" size="10"></td>
		</tr>
		<tr>
			<td>메뉴설명</td>
			<td align="left">
				<textarea id="menuNote"  name="menuNote" rows="5" cols="40"></textarea>
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
	
	if($("#menuId").val() > 0 && $("#menuId").val() != null){
		// menuID가 넘어왔으면 조회한다. 
		$.getJSON("../service.jsp", $("#menuForm").serialize(), function(json) {

			if(json.code < 0){
				// 조회시 오류 발생 
				alert(json.message);
				return false; 
			}
			
			//alert(json.data.menuNm); 
			$("#menuNm").val(json.data.menuNm);  
			$("#menuRegDt").val(json.data.menuRegDt);
			$("#menuSeq").val(json.data.menuSeq);
			$("#menuNote").val(json.data.menuNote);
	
			// 조회후에는 저장모드로 변경한다.(서비스 클래스명을 변경한다.) 
			$("#serviceName").val("admin.UpdateMenu");
		});
	}
	else {
		// 등록 모드 
		$("#serviceName").val("admin.InsertMenu");
	}; 

	$("#delete").click(function(evnt) {
		// 삭제를 위한 서비스명을 변경한다.  
		$("#serviceName").val("admin.DeleteMenu");
		$.getJSON("../service.jsp", $("#menuForm").serialize(), function(json) {
			alert(json.message);
			parent.closeFrame();
			return false; 
		}); 
	}); 

	$("#close").click(function(evnt) {
		parent.closeFrame(); 
	}); 

	$("#update").click(function(event) {
		updateMenu(); 	
	}); 
	
	$("#updateClose").click(function(event) {
		updateMenu(); 
		parent.closeFrame(); 
	}); 
});

function updateMenu(){
	$.getJSON("../service.jsp", $("#menuForm").serialize(), function(json) {
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

