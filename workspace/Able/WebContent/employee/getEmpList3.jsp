<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<STYLE TYPE="text/css">
  th {font-family: Arial; font-size: 10pt;}
  td {font-family: Arial; font-size: 8pt;}
 </STYLE>
  
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>

<script type="text/javascript" >

$(document).ready(function(){
	$("#retrieve").click(function(event) {
		$.getJSON("service.jsp", {ServiceName:"EmpListAll"}, function(data) {
			//진짜 어렵당. json은 서버측에서 리턴하기 전에 Json Object명(EmpListAll)을 강제로 값을 넣어주는 것이다.
			// alert(data.json.length);
			//alert(data.json[0].emp_nm);

			$.each(data.json, function(key, value) {
				
				var addRow = "";
				addRow 	= "<tr>" 
							+ "<td>" + value.emp_no + "</td>"
							+ "<td>" + value.emp_nm + "</td>"
							+ "<td>" + value.eng_nm + "</td>"
							+ "<td>" + value.ctz_no + "</td>"
							+ "<td>" + value.emp_kind_cd + "</td>"
							+ "<td>" + value.birth_ymd + "</td>"
							+ "<td>" + value.hire_ymd + "</td>"
							+ "<td>" + value.in_offi_yn + "</td>"
							+ "<td>" + value.retire_ymd + "</td>"
							+ "</tr>" ; 
				$("#dataTable tr:last").after(addRow);
			}) ; 
		});
	}); 	
});

</script>          
  
</head>
<body>
<menu>
	<button id="retrieve" type="button" onclick="retrieve()">retrieve Data</button>
</menu>

<table id="dataTable" border="0">
	<tr align=center valign=top bgcolor=orange>
		<th width="200" >사번</th> 
		<th width="200">성명</th>
		<th width="200">영문명</th>
		<th width="200">주민번호</th>
		<th width="200">사원종류</th>
		<th width="200">생일</th>
		<th width="200">입사일</th>
		<th width="200">재직여부</th>
		<th width="200">퇴사일</th>
	</tr>
</table>

</body>


 

</html>