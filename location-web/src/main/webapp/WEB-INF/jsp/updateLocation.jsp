<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Locations</title>
</head>
<body>
	<form action="updateLoc" method="post">
<pre>
Id: <input type="text" name="id" value="${location.id}" readonly/>
Code: <input type="text" name="code" value="${location.code}"/>
Name: <input type="text" name="name" value="${location.name}"/>
Type: Urban<input type="radio" name="type" value="URBAN" ${location.name=='URBAN'?'checked':''}/>
Rural<input type="radio" name="type" value="RURAL" ${location.name=='RURAL'?'checked':''}/>
<input type="submit" value="Save">
</pre>
</form>
</body>
</html>