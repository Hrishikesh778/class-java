<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
    window.onload = function() {
        var message = "<%= request.getAttribute("message") %>";
        if (message !== "null") {
            alert(message);
        }
    }
</script>

</head>
<body>
<h1>this is jsp page one and two</h1>

<a href="home">go  to home</a>
<a href="home2">Go to Home2</a>

<br>
<a href="work">Go to Student details</a>

<form action="work"  method="POST">
	Enter your name<input type="text" name="name"><br>
	Enter your std<input type="number" name="std"><br>
	Enter your mobile No<input type="text" name="mobileno"><br>
	<input type="submit" value="SEND">
</form>

<br>
<h1>Send redirect</h1>

<form action="MySearcher">
	<input type="text" name="name">
	<input type="submit" value="Google Search">
	</form>

	<a href="servlet1">Go to servlet 1 of send redirect</a>



</body> 
</html>