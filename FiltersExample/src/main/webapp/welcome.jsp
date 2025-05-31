<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page errorPage="Errorpage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
<%-- <% String name= request.getParameter("uname"); %>

<h1>welcome <%= name %> </h1>
 --%>

<% out.println("today is : "+ new Date()); %>


<%
String one= request.getParameter("one");
String two= request.getParameter("two");


int num1 = Integer.parseInt(one);
int num2 = Integer.parseInt(two);

int div=num1 / num2;
%>

<h1>Divison <%= div %></h1>

</body>
</html>