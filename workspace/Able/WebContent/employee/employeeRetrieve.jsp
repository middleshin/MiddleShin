<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<STYLE TYPE="text/css"> 
	th {
		font-family: Arial ; 
		font-size: 9pt ; 
		align:center ;
		vertical-align:top ;
		bgcolor:silver ;
		vertical-align:bottom;
		color:white ;  
		height:18px;
	}

	tr {
		font-family: arial ; 
		font-size: 9pt ;
		text-align:center ; 
		vertical-align:bottom;
		bgcolor:black ;
	}
	
	input {
		font-family: arial ; 
		font-size: 9pt ;
		text-align:center ; 
		vertical-align:bottom;
		bgcolor:black ;
	}
	
	
 </STYLE>

<script type="text/javascript" src="../js/jquery-1.7.2.js"></script>
<script type="text/javascript" >

$(document).ready(function(){
	$("#close").click(function(event) {
		parent.$.closeFrame(); 
	}); 

	$("#update").click(function(event) {
		$("#employeeForm").submit();  
	}); 

	$("#employeeForm").submit(function(event) {

		$.getJSON("../service.jsp", $(this).serialize(), function(data) {
			// data.json으로 자료가 온다. 
			// 별도 리턴값을 설정할 수 있어야 한다. 
			if(data.json == 1){ 
				alert("자료가 저장되었습니다");
			}
			else {
				alert("자료저장 시 오류가 발생하였습니다. error Code : " + data);
			}

		})
		.error(function() {
		    alert("err session : 자료저장 시 오류가 발생하였습니다. error Code : " + data);
		});
		return false;
	}); 

	var param="<%=request.getParameter("emp_id")%>" ; 
	
	$.getJSON("../service.jsp", {ServiceName:"employee.GetEmployee", emp_id:param}, function(data) {
		
		// multi row 하고는 다르네... 이걸 어떻게 판단하지? 	
		// 1행만 리턴할 경우에 컬럼명이 key로, data가 value로 전달된다. 
		// $.each(data.json, function(key, value) { 가 한 행의 컬럼 리스트를 돈다.   
			
		 $("#emp_id").val(data.json.emp_id) ;
		 $("#company_cd").val(data.json.company_cd) ;
		 $("#emp_no").val(data.json.emp_no) ;
		 $("#emp_nm").val(data.json.emp_nm) ;
		 $("#eng_nm").val(data.json.eng_nm) ;
		 $("#chi_nm").val(data.json.chi_nm) ;
		 $("#ctz_no").val(data.json.ctz_no) ;
		 $("#emp_kind_cd").val(data.json.emp_kind_cd) ;
		 $("#hire_cd").val(data.json.hire_cd) ;
		 $("#in_offi_yn").val(data.json.in_offi_yn) ;
		 $("#sex_cd").val(data.json.sex_cd) ;
		 $("#birth_ymd").val(data.json.birth_ymd) ;
		 $("#solar_type").val(data.json.solar_type) ;
		 $("#pos_grd_cd").val(data.json.pos_grd_cd) ;
		 $("#pos_grd_ymd").val(data.json.pos_grd_ymd) ;
		 $("#next_pos_grd_ymd").val(data.json.next_pos_grd_ymd) ;
		 $("#pos_cd").val(data.json.pos_cd) ;
		 $("#pos_ymd").val(data.json.pos_ymd) ;
		 $("#yearnum").val(data.json.yearnum) ;
		 $("#yearnum_ymd").val(data.json.yearnum_ymd) ;
		 $("#next_yearnum_ymd").val(data.json.next_yearnum_ymd) ;
		 $("#org_cd").val(data.json.org_cd) ;
		 $("#org_ymd").val(data.json.org_ymd) ;
		 $("#pay_kind_cd").val(data.json.pay_kind_cd) ;
		 $("#pay_org_cd").val(data.json.pay_org_cd) ;
		 $("#work_org_cd").val(data.json.work_org_cd) ;
		 $("#work_org_ymd").val(data.json.work_org_ymd) ;
		 $("#duty_cd").val(data.json.duty_cd) ;
		 $("#duty_ymd").val(data.json.duty_ymd) ;
		 $("#call_cd").val(data.json.call_cd) ;
		 $("#call_ymd").val(data.json.call_ymd) ;
		 $("#job_cd").val(data.json.job_cd) ;
		 $("#job_ymd").val(data.json.job_ymd) ;
		 $("#hire_ymd").val(data.json.hire_ymd) ;
		 $("#annual_cal_ymd").val(data.json.annual_cal_ymd) ;
		 $("#retire_ymd").val(data.json.retire_ymd) ;
		 $("#retire_plan_ymd").val(data.json.retire_plan_ymd) ;
		 $("#retire_type_cd").val(data.json.retire_type_cd) ;
		 $("#training_s_ymd").val(data.json.training_s_ymd) ;
		 $("#training_e_ymd").val(data.json.training_e_ymd) ;
		 $("#emp_kind_sub_cd").val(data.json.emp_kind_sub_cd) ;
		 $("#repreduty_cd").val(data.json.repreduty_cd) ;
		 $("#file_nm").val(data.json.file_nm) ;
		 $("#file_id").val(data.json.file_id) ;
		 $("#annual_dd").val(data.json.annual_dd) ;
		 $("#mod_user_id").val(data.json.mod_user_id) ;
		 $("#mod_date").val(data.json.mod_date) ;
		 $("#op_group_cd").val(data.json.op_group_cd) ;
		 $("#op_group_ymd").val(data.json.op_group_ymd) ;
	}); 
});
</script>          
  
</head>

<body style="position: absolute; background-color:white; ">

	<div style="color:white ;background-color:grey; font-family: Arial ;font-size: 9pt ; width:100%; text-align:center; line-height:22px;">
		<b>사원정보</b>
	</div>

	<div style="background-color:white;  width:100%; text-align:right; ">
		<button id="update" type="button" >update</button>
		<button id="close" type="button" >close window </button>
	</div>

<form id="employeeForm">
	
	<input type="hidden" name="ServiceName" value="employee.UpdateEmployee" >

	<table id="dataTable" style="border:1px solid grey;">
		<tr align=center valign=top bgcolor=grey >
			<th width="150px">항목명</th>
			<th width="180px">자료</th>
			<th width="150px">항목명</th>
			<th width="180px">자료</th>
			<th width="150px">항목명</th>
			<th width="180px">자료</th>
		</tr>
		<tr>
			<td>emp id </td>	
			<td><input type="text" id="emp_id"  name="emp_id" > </td>
			<td>company_cd </td>
			<td><input type="text" id="company_cd" name="company_cd"></td>
			<td>emp_no </td>
			<td><input type="text" id="emp_no" name="emp_no"></td>
		</tr>
		
		<tr>
			<td>emp_nm </td>
			<td><input type="text" id="emp_nm" name="emp_nm"></td>
			<td>eng_nm </td>
			<td><input type="text" id="eng_nm" name="eng_nm"></td>
			<td>chi_nm </td>
			<td><input type="text" id="chi_nm" name="chi_nm"></td>
		</tr>
		
		<tr>
			<td>ctz_no </td>
			<td><input type="text" id="ctz_no" name="ctz_no"></td>
			<td>emp_kind_cd</td>
			<td><input type="text" id="emp_kind_cd" name="emp_kind_cd"></td>
			<td>hire_cd </td>
			<td><input type="text" id="hire_cd" name="hire_cd"></td>
		</tr>
		
		<tr>
			<td>in_offi_yn </td>
			<td><input type="text" id="in_offi_yn" name="in_offi_yn"></td>
			<td>sex_cd </td>
			<td><input type="text" id="sex_cd" name="sex_cd"></td>
			<td>birth_ymd </td>
			<td><input type="text" id="birth_ymd" name="birth_ymd"></td>
		</tr>
		
		<tr>
			<td>solar_type </td>
			<td><input type="text" id="solar_type" name="solar_type"></td>
			<td>pos_grd_cd </td>
			<td><input type="text" id="pos_grd_cd" name="pos_grd_cd"></td>
			<td>pos_grd_ymd </td>
			<td><input type="text" id="pos_grd_ymd" name="pos_grd_ymd"></td>
		</tr>
		
		<tr>
			<td>next_pos_grd_ymd</td>
			<td><input type="text" id="next_pos_grd_ymd" name="next_pos_grd_ymd"></td>
			<td>pos_cd </td>
			<td><input type="text" id="pos_cd" name="pos_cd"></td>
			<td>pos_ymd </td>
			<td><input type="text" id="pos_ymd" name="pos_ymd"></td>
		</tr>
			
		<tr>
			<td>yearnum </td>
			<td><input type="text" id="yearnum" name="yearnum"></td>
			<td>yearnum_ymd </td>
			<td><input type="text" id="yearnum_ymd" name="yearnum_ymd"></td>
			<td>next_yearnum_ymd </td>
			<td><input type="text" id="next_yearnum_ymd" name="next_yearnum_ymd"></td>
		</tr>
			
		<tr>
			<td>org_cd </td>
			<td><input type="text" id="org_cd" name="org_cd"></td>
			<td>org_ymd </td>
			<td><input type="text" id="org_ymd" name="org_ymd"></td>	
			<td>pay_kind_cd </td>
			<td><input type="text" id="pay_kind_cd" name="pay_kind_cd"></td>
		</tr>
			
		<tr>
			<td>pay_org_cd </td>
			<td><input type="text" id="pay_org_cd" name="pay_org_cd"></td>
			<td>work_org_ymd </td>
			<td><input type="text" id="work_org_ymd" name="work_org_ymd"></td>
			<td>duty_cd </td>
			<td><input type="text" id="duty_cd" name="duty_cd"></td>
		</tr>
			
		<tr>
			<td>duty_ymd </td>
			<td><input type="text" id="duty_ymd" name="duty_ymd"></td>
			<td>call_cd </td>
			<td><input type="text" id="call_cd" name="call_cd"></td>
			<td>call_ymd </td>
			<td><input type="text" id="call_ymd" name="call_ymd"></td>
		</tr>
			
		<tr>
			<td>job_cd </td>
			<td><input type="text" id="job_cd" name="job_cd"></td>
			<td>job_ymd </td>
			<td><input type="text" id="job_ymd" name="job_ymd"></td>
			<td>hire_ymd </td>
			<td><input type="text" id="hire_ymd" name="hire_ymd"></td>
		</tr>
			
		<tr>
			<td>annual_cal_ymd </td>
			<td><input type="text" id="annual_cal_ymd" name="annual_cal_ymd"></td>
			<td>retire_ymd </td>
			<td><input type="text" id="retire_ymd" name="retire_ymd"></td>
			<td>retire_plan_ymd </td>
			<td><input type="text" id="retire_plan_ymd" name="retire_plan_ymd"></td>
		</tr>
			
		<tr>
			<td>retire_type_cd </td>
			<td><input type="text" id="retire_type_cd" name="retire_type_cd"></td>
			<td>training_s_ymd </td>
			<td><input type="text" id="training_s_ymd" name="training_s_ymd"></td>
			<td>training_e_ymd </td>
			<td><input type="text" id="training_e_ymd" name="training_e_ymd"></td>
		</tr>
			
		<tr>
			<td>emp_kind_sub_cd </td>
			<td><input type="text" id="emp_kind_sub_cd" name="emp_kind_sub_cd"></td>
			<td>repreduty_cd </td>
			<td><input type="text" id="repreduty_cd" name="repreduty_cd"></td>
			<td>file_nm </td>
			<td><input type="text" id="file_nm" name="file_nm"></td>
		</tr>
			
		<tr>
			<td>file_id </td>
			<td><input type="text" id="file_id" name="file_id"></td>
			<td>annual_dd </td>
			<td><input type="text" id="annual_dd" name="annual_dd"></td>
			<td>mod_user_id </td>
			<td><input type="text" id="mod_user_id" name="mod_user_id"></td>
		</tr>
					
		<tr>
			<td>mod_date </td>
			<td><input type="text" id="mod_date" name="mod_date"></td>
			<td>op_group_cd </td>
			<td><input type="text" id="op_group_cd" name="op_group_cd"></td>
			<td>op_group_ymd </td>
			<td><input type="text" id="op_group_ymd" name="op_group_ymd"></td>
		</tr>
		<tr><td><p></td></tr>	
	</table>
</form>

</body>
</html>


