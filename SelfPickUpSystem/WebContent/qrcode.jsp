<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*,java.util.*,qrcode.*" %>
<%@ page import="qrcode.table" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Self Pick Up System</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<div>
	<h2>Scan code to pick up order!</h2>
	</div>
	<%
	passwordGenerator pwc = new passwordGenerator();
	String num = pwc.createPassWord(16);
	%>
	<script>
	var str = "<%=num%>";
	document.write("<img src='http://qr.topscan.com/api.php?text=" + str + "' alt='QRCode' style='width:30%'/>");
    </script>
    <%
	String path = "d:/selfPickUpSystem/";
	String user = "{\"password\":";
	user += "\"";
	user +=	num;
	user += "\"}";
	table.dropTable(path, "json.html");
	table.createTable(path, "json.html");
	table.insert(user, path, "json.html");
 	%>
 	<br>
    <a href="thankyoupage.html" style= "font-size: 20px;padding: 20px 50px 20px 50px;width: 20%;">Picked Up</a>
</body>
</html>