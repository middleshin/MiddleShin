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
		$.getJSON("service.jsp", {ServiceName:"PayrollList"}, function(data) {
			
			//진짜 어렵당. json은 서버측에서 리턴하기 전에 Json Object명(EmpListAll)을 강제로 값을 넣어주는 것이다.
			
			// alert(data.json.length); 	//alert(data.json[0].emp_nm);

			// alert(data.json.length); 

			// 세부 자료 확인 
			alert(data.json[1].employeeModel.emp_nm);  
			
			$.each(data.json, function(key, value) {
				
				
				
				var addRow = "";
				
				
				addRow 	= "<tr>" 
							+ "<td>" + value.employeeModel.emp_nm + "</td>"
							+ "<td>" + value.pay_ymd_id + "</td>"
							+ "<td>" + value.emp_id + "</td>"
							+ "<td>" + value.salary_type_cd + "</td>"
							+ "<td>" + value.org_cd + "</td>"
							+ "<td>" + value.pay_org_cd + "</td>"
							+ "<td>" + value.pos_grd_cd + "</td>"
							+ "<td>" + value.duty_cd + "</td>"
							+ "<td>" + value.psum + "</td>"
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
		<th width="200" >PAYROLL_ID</th> 
		<th width="200">PAY_YMD_ID</th>
		<th width="200">EMP_ID</th>
		<th width="200">SALARY_TYPE_CD</th>
		<th width="200">ORG_CD</th>
		<th width="200">PAY_ORG_CD</th>
		<th width="200">POS_GRD_CD</th>
		<th width="200">DUTY_CD</th>
		<th width="200">PSUM</th>
	</tr>
</table>

</body>


 

</html>