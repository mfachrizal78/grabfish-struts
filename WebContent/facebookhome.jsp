<%@page import="com.javapapers.java.social.facebook.FBConnection"%>
<%@page import="com.javapapers.java.social.facebook.FBGraph"%>
<%@page import="java.util.Map"%>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Java Facebook Login</title>
</head>
<body style="text-align: center; margin: 0 auto;">
<%

	String code = request.getParameter("code");
	System.out.println("Code " + code);
	if (code == null || code.equals("")) {
	throw new RuntimeException("ERROR: Didn't get code parameter in callback.");
	}
	
	FBConnection fbConnection = new FBConnection();
	String accessToken = fbConnection.getAccessToken(code);

	FBGraph fbGraph = new FBGraph(accessToken);
	String graph = fbGraph.getFBGraph();
	Map<String, String> fbProfileData = fbGraph.getGraphData(graph);
%>
 <div>Welcome <%=fbProfileData.get("name").toString() %>
 <div>Email <%=fbProfileData.get("email")  %>
 
</body>
</html>