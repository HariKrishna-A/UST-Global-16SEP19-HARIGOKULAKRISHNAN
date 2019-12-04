
<%
	String ss = (String) request.getAttribute("msg1");
%>


<html>
<body>
	<h2 style="color: red">${msg}</h2>
	<h2><%=ss%></h2>
	<h3>${name}</h3>
	<h3>${id}</h3>
	
</body>
</html>
