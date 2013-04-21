<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>메뉴별 Role 선택</title>
	<link REL="stylesheet" type="text/css" href="../alleyStyle.css">
</head>

<body style="border:1; background-color:white;">
	<div id="popUpTitleDiv" >
		<b>메뉴 선택하기</b>
	</div> 
	<p>	
	
	<form id="roleMenuForm" >
		<input type="hidden" id="serviceName" name="serviceName" value="admin.SelectRoleMenuByAll" >
		<input type="hidden" id="roleId"  name="roleId" value=<%=request.getParameter("roleId")%>>
		<div style="border:1px solid grey; height:300px; margin:1px; overflow:auto" >
		<table style="align:center" id="roleMenuTable" >
			<tr align=center valign=top bgcolor=grey >
				<th width="30px">No</th>
				<th width="30px">선택</th>
				<th width="100px">메뉴명</th>
				<th width="300px">설명</th>
				<th width="40px">Seq</th>
				<th width="80px">등록일</th>
				<th style="display:none;">roleId</th>
			</tr>
		</table>
		</div>
		<p>
		<div style="background-color:white; text-align:right; ">
			<button id="update" type="button" >적용</button>
			<button id="close" type="button" >닫기</button>
		</div>
	</form>
	
</body>

<script type="text/javascript" src="../js/jquery-1.7.2.js"></script>
<script type="text/javascript" >

$(document).ready(function(){
	
	if($("#roleId").val() > 0 && $("#roleId").val() != null){
		// menuID가 넘어왔으면 조회한다. 
		$.getJSON("../service.jsp", $("#roleMenuForm").serialize(), function(json) {

			if(json.code < 0){
				// 조회시 오류 발생 
				alert(json.message);
				return false; 
			}
			
			$.each(json.data, function(key, value) {
				var addRow = "";
				addRow 	= "<tr>" 
					+ "<td>" + (key+1)  + "</td>" ; 
				
				if(value.menuModel.roleMenuId == null){
					addRow = addRow + "<td><input type='checkbox' name='checkedMenu'></td>" ;  
				}
				else { // 이미 등록된 메뉴 표시하기  
					addRow = addRow + "<td><input type='checkbox' name='checkedMenu' checked></td>"
				}
			
				addRow = addRow 
					+ "<td id='col_string'>" + value.menuModel.menuNm + "</a></td>"
					+ "<td id='col_string'>" + value.menuModel.menuNote + "</td>"
					+ "<td>" + value.menuModel.menuSeq + "</td>"
					+ "<td>" + value.menuModel.menuRegDt + "</td>"
					+ "<td><input type='text' id='menuId' name='menuId' value='" + value.menuModel.menuId + "'></td>"
					
					//+ "<td style='display:none;'>" + value.menuModel.menuId + "</td>"
					+ "</tr>" ; 

				$("#roleMenuTable tr:last").after(addRow);
				// 팝업 윈도우 링크 Setting 
	
				// 조회후에는 저장모드로 변경한다.(서비스 클래스명을 변경한다.) 
				$("#serviceName").val("admin.UpdateRoleMenu");
			}); 
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
	$.getJSON("../service.jsp", $("#roleMenuForm").serialize(), function(json) {
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

