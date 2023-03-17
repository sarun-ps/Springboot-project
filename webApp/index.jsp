<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Portal</title>
</head>
<body bgcolor="azure">
<h1>Enter Student Details</h1>
<form action="addstud">
Register number<input type="text" name=regno><br>
Student Name<input type="text" name=sname><br>
Department<input type="text" name=dept><br>
Fees<input type="text" name=fees><br>
<input type="submit">
</form>
<form action="getstud">
<h1>Display Student Details</h1>
Register number<input type="text" name=regno><br>
<input type="submit">
</form>
<form action="deletestud">
<h1>Delete Student Details</h1>
Register number<input type="text" name=regno><br>
<input type="submit">
</form>
<form action="updatestud">
<h1>Update Student Details</h1>
Register number<input type="text" name=regno><br>
<input type="submit">
</form>
</body>
</html>