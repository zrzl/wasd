<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
      <h1>JSTL的标签库使用</h1>
		<h2>out 标签</h2>
	<c:out value="${y }" escapeXml="true" default="<h1>hello</h1>" ></c:out>
	
	<c:out value="${x}" escapeXml="false">
		<h1>hello</h1>
	</c:out>
	
	<c:set var="name" value="lss" scope="page"></c:set>
	<b>${name }</b>
	<c:out value="${name }"></c:out>
	
	<c:set var="name"  scope="session">
		ls
	</c:set>
	<b>${sessionScope.name }</b>
	
	<% 
	session.setAttribute("name", "shsxt"); 
	request.setAttribute("name", "bjsxt");
	pageContext.setAttribute("name", "sjsxt");
	application.setAttribute("name", "pdsxt");
    %>
      ${name } ---
      <c:remove var="name" />
    ${name }
</body>
</html>