<%@page import="com.controller.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
    margin: 0;
    padding: 20px;
}

h1 {
    text-align: center;
    color: #333;
}

.container {
    max-width: 600px;
    margin: auto;
    background: white;
    padding: 20px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    border-radius: 8px;
}

.student-record {
    background: #e3e3e3;
    padding: 10px;
    margin-bottom: 10px;
    border-radius: 5px;
}

.student-record h2 {
    margin: 5px 0;
    color: #555;
}
</style>
</head>
<body>
<div class="container">
 <h1>Student Records</h1>
	<%
List<Student> students= (List<Student>) request.getAttribute("students");
	
if(students !=null){
	for(int i=0;i<students.size();i++){
		%>
	<div class="student-record">
		<h2>ID:<%= students.get(i).getId()%></h2>
		<h2>Name:<%= students.get(i).getName() %></h2>
		<h2>STD:<%= students.get(i).getStd() %></h2>
	</div>
	<%
		
	}
}

%>

</body>
</html>