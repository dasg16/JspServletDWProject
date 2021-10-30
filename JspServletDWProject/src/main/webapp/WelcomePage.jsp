<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
if(session.getAttribute("username")==null)
{
	response.sendRedirect("LoginPage.jsp");
}


%>
Welcome to my webpage ${username}
<br>
<br>
<div id="typing">Our trip to <span>Navitat</span></div>
<div id="crow">|</div>
<br>
<iframe width="560" height="315" src="https://www.youtube.com/embed/iv0c_HYhcTA" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
<br>
<br>
<form action="logoutprocess" method="post">
<input type="submit"  style="background-color: #f2dfa6" value="logout" >
</form> 

</body>
</html>