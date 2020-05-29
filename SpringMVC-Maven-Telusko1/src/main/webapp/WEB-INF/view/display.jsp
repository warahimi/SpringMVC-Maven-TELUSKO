<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
 <%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 the result is : <%= request.getAttribute("result") %> <br>
 the result is : ${result }
</body>
</html>