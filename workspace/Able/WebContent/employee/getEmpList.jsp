<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link REL="stylesheet" type="text/css" href="../alleyStyle.css">
<script type="text/javascript" src="../js/jquery-1.7.2.js"></script>

<script type="text/javascript" >

$(document).ready(function(){
	
	$("#delete").click(function(event) {
		// delete table list gt(0)은 0보다 큰 element를 찾아서 지우는것. 
		$("#dataTable tr:gt(0)").remove(); 
		parent.$.resizeContent( $("body").height() + 100 );
		
	}); 

	
	$("#create").click(function(event) {
  		var contents = "<div id='con' name='con' style='position:absolute;top:200px;left:100px;'></div>";
  		$("body").append(contents);
	 });
	
	$("#retrieve").click(function(event) {
		
		// dataTable에서 0보다 큰 tr class들을 지운다.
		// 첫 행만 남기고 모두 지운다. 
		$("#dataTable tr:gt(0)").remove();
		
		$.getJSON("../service.jsp", {ServiceName:"employee.EmpListAll"}, function(data) {
			//진짜 어렵당. json은 서버측에서 리턴하기 전에 Json Object명(EmpListAll)을 강제로 값을 넣어주는 것이다.
			//alert(data.json[0].emp_nm);
			$.each(data.json, function(key, value) {
				var addRow = "";
				addRow 	= "<tr>" 
							+ "<td><a href='#'>" + value.emp_id + "</a></td>"
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
				
				// emp_id column에 상세 페이지를 오픈하기 위하여 Click 이벤트에 함수를 Bind한다. bind 대신에 on를 사용해도 된다.  
				$("#dataTable tr:last td:first-child").on("click",function(){
					// width & height & url 
					parent.$.openFrame(1000, 500, "./employee/employeeRetrieve.jsp?emp_id=" + value.emp_id);  
				});
			}) ;
			
			// resize parent body 			
			parent.$.resizeContent( $("body").height() + 100 ); 
			
 		});

	}); 	 // end of retrieve 

});

</script>          
 
</head>
<body>
	<div id="header" >
		Alleys Main Page 
	</div>
	
<div style="text-align:right; ">
	<button id="retrieve" type="button" >retrieve Data</button>
	<button id="delete" type="button" >delete Data</button>
</div>

<table id="dataTable" border="0">
	<tr align=center valign=top bgcolor=grey >
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