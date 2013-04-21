<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>사용자관리</title>
	<link REL="stylesheet" type="text/css" href="../alleyStyle.css">
</head>

<body style="border:1; background-color:white;">
	<div id="popUpTitleDiv" >
		<b>사용자 정보</b>
	</div> 
	<p>	
	
	<form id="usrForm" >
	<input type="hidden" id="serviceName" name="serviceName" value="admin.SelectUsrById" >

	<table>
	<tr>
		<td align="left"><input readonly type="text" id="comId"  name="comId" size="10" value=<%=request.getParameter("comId")%>></td>
		<td align="left"><input readonly type="text" id="usrId"  name="usrId" size="10" value=<%=request.getParameter("usrId")%>></td>
	</tr>
	<tr>
		<td>회사명</td>
		<td align="left"><input readonly type="text" id="comLocNm"  name="comLocNm" size="20"></td>
	</tr>

	<tr>
		<td>사용자명</td>
		<td align="left"><input type="text" id="usrNm"  name="usrNm" size="20"></td>
	</tr>
	<tr>
		<td>로그인 ID</td>
		<td align="left"><input type="text" id="usrLoginId"  name="usrLoginId" size="30"></td>
	</tr>

	<tr>
		<td>패스워드</td>
		<td align="left"><input type="text" id="usrPasswd"  name="usrPasswd" size="30"></td>
	</tr>
	<tr>
		<td>시작일</td>
		<td align="left"><input type="date" class="date" id="usrStartDt"  name="usrStartDt" size="20"></td>
	</tr>
	<tr>
		<td>종료일</td>
		<td align="left"><input type="date" class="date" id="usrCloseDt"  name="usrCloseDt" size="20"></td>
	</tr>

	<tr>
		<td>설 명</td>
		<td align="left">
			<textarea id="usrNote"  name="usrNote" rows="5" cols="40"></textarea>
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
	
	if($("#usrId").val() > 0 && $("#usrId").val() != null){
		// UsrID가 넘어왔으면 조회한다. 
		$.getJSON("../service.jsp", $("#usrForm").serialize(), function(json) {

			if(json.code < 0){
				// 조회시 오류 발생 
				alert(json.message);
				return false; 
			}
			
			//alert(json.data.usrNm); 
			$("#comLocNm").val(json.data.comModel.comLocNm); // 회사명 
			$("#usrNm").val(json.data.usrNm);  
			$("#usrLoginId").val(json.data.usrLoginId);
			$("#usrPasswd").val(json.data.usrPasswd);
			$("#usrStartDt").val(json.data.usrStartDt);
			$("#usrCloseDt").val(json.data.usrCloseDt);
			$("#usrNote").val(json.data.usrNote);
			$("#comId").val(json.data.comId);
	
			// 조회후에는 저장모드로 변경한다.(서비스 클래스명을 변경한다.) 
			$("#serviceName").val("admin.UpdateUsr");
		});
	}
	else {
		
		// 회사명만 조회 
		$("#serviceName").val("admin.SelectComById");
		
		$.getJSON("../service.jsp", $("#usrForm").serialize(), function(json) {

			if(json.code < 0){
				// 조회시 오류 발생 
				alert(json.message);
				return false; 
			}
			$("#comLocNm").val(json.data.comLocNm); // 회사의 회사명 
		});
		
		// 등록 모드 
		$("#serviceName").val("admin.InsertUsr");
	}; 

	$("#delete").click(function(evnt) {
		// 삭제를 위한 서비스명을 변경한다.  
		$("#serviceName").val("admin.DeleteUsr");
		$.getJSON("../service.jsp", $("#usrForm").serialize(), function(json) {
			alert(json.message);
			parent.closeFrame();
			return false; 
		}); 
	}); 

	$("#close").click(function(evnt) {
		parent.closeFrame(); 
	}); 

	$("#update").click(function(event) {
		updateUsr(); 	
	}); 
	
	$("#updateClose").click(function(event) {
		updateUsr(); 
		parent.closeFrame(); 
	}); 
});

function updateUsr(){
	// service Name을 Update로 변경한다. 	
	// admin.UpdateCom 서비스 클래스 호출 
	
	$.getJSON("../service.jsp", $("#usrForm").serialize(), function(json) {
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

