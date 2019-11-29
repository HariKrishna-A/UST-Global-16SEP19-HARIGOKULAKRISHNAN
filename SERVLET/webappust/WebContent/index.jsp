<!DOCTYPE html>
<%@page import="java.util.Date"%>
<html>
<head>
<meta charset="ISO-8859-1">

<%!

public void jspInit(){
	System.out.println("this is init");
}
public void jspDestroy(){
	System.out.println("this is destroy");
}
%>
<title>Insert title here</title>
</head>
<%
	Date date = new Date();
	m();
%>
<%!
public int i = 10;
public void m() {
	System.out.println(i);
}
%>

<body>
	<h1 Style="color: green;">
		Date and Time is
		<%=date%></h1>
</body>
</html>