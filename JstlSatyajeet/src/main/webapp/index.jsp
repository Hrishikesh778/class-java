<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>This is HTMl</h1>
	<%-- <c:out value="${'Welcome to javaTpoint'}" />
	<br/>
	
	<c:set var="income" scope="session" value="${4000*8}" />
	
	<p>
		Before Remove Value is:
		<c:out value="${income}" />
	</p>
	
	<c:remove var="income" />


	<p>
		After Remove Value is:
		<c:out value="${income}" />
	</p>
	
	
	<c:catch var="catchtheException">
		<%
		int x = 2 / 0;
		%>
	</c:catch>
	
	<c:if test="${catchtheException != null}">
		<p>
			The type of exception is : ${catchtheException} <br /> There is an
			exception: ${catchtheException.message}
		</p>
	</c:if> --%>

	<!-- switch case -->

	<%-- <c:set var="income" scope="session" value="${4000*4}"/>
	
	<p>Your income is : <c:out value="${income}"/></p>  
	
	<c:choose>  
    <c:when test="${income <= 1000}">  
       Income is not good.  
    </c:when>  
    <c:when test="${income > 10000}">  
        Income is very good.  
    </c:when>  
    <c:otherwise>  
       Income is undetermined...  
    </c:otherwise>  
</c:choose>   --%>

	<!-- for each loop -->
	<%-- <c:forEach var="j" begin="1" end="30">  
   Item <c:out value="${j}" />
		<p>
	</c:forEach>
 --%>

	<!-- split style fortokens -->
	<c:forTokens items="Rahul-Nakul-Rajesh" delims="-" var="name">
		<c:out value="${name}" />
		<br />
	</c:forTokens>


	<c:url value="/index1.jsp" var="completeURL">
		<c:param name="trackingId" value="786" />
		<c:param name="user" value="Satyajeet" />
	</c:url>



	${completeURL}

</body>
</html>