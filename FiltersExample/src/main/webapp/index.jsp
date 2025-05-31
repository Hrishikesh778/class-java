<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
<a href="servlet1">visit</a>

<%!

public int add(int a, int b){
	return a+b;
}

 
%>

<% int a =25/5; %>

<h2> <%= a %></h2>
<h2> <%= add(10,20) %></h2>


<!-- <form action="welcome.jsp">
enter your name<input type="text" name="uname">
<input type="submit" value="go"> 
</form> -->


<form action="welcome.jsp">
Number one<input type="text" name="one">
Number two<input type="text" name="two">
<input type="submit" value="Divide"> 
</form>

</body>
</html>