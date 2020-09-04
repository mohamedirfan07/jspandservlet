<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<% 
 int i = Integer.parseInt(request.getParameter("num1"));
 int j = Integer.parseInt(request.getParameter("num2"));
 try{//to handle exception
 int k = i/j;
 out.println("Output is :"+k);//prints the output until the divisor is'nt zero
 }
 catch(Exception e)//to handle exception
 {
	 out.println("Exception " + e.getMessage());//if the divisor is zero it will give u error msg
 }

%>
</body>
</html>