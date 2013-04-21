<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
	<head>
	<meta charset="UTF-8">
	<title>회사정보 조회</title>
	<link REL="stylesheet" type="text/css" href="../alleyStyle.css">
</head>

<body>
<div class="main" >

<div class="search">
	<table border="1">
	<tr>
		<td>
			<form id="searchComNm">
			<input type="hidden" name="serviceName" value="admin.SelectComByNm" >
			
			회사: <input type="text" id="comLocNm"  name="comLocNm" >
			</form>
		</td>
		<td>
			<button id="retrieveCom" type="button" onclick="">조회</button>
			<button id="insertCom" type="button" >등록</button>
		</td>
	</tr>
	</table>
</div>

<div class="container">
<table id="comList">
<tr>
	<th width="50px">No.</th> 
	<th width="200px">회사명</th>
	<th width="100px">법인번호</th>
	<th width="200px">대표자</th>
	<th width="350px">설명</th>
	<th width="350px">상세보기</th>
</tr>

<% 
	// ServiceBorker sb = new 	
	
%>

</table>

</div>

</div>

</body>
	
</html>