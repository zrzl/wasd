<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.shsxt.bean.Person"%>
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
	<c:out value="${y }" escapeXml="true" default="<h1>hello</h1>"></c:out>
	
	<c:out value="${x}" escapeXml="false">
		<h1>hello</h1>
	</c:out>
	<hr/>
	<h1>set标签</h1>
	<!-- 在page域但中存入一个值    name     lss -->
	<c:set var="name" value="lss" scope="page"></c:set>
	<b>${name }</b>
	<c:out value="${name }"></c:out>
	<br/>
	
	<c:set var="name" scope="session">
		set:lss
	</c:set>
	${sessionScope.name }
	<%-- ${sessionScope } --%>
	
	<br/>
	<%
	Person person = new Person(); 
	request.setAttribute("p", person);
	%>
	
	<c:set target="${p }" property="name" value="lisisi" ></c:set>
	${p.name }
	
	<br/>
	<c:set target="${p }" property="name">
		suibian
	</c:set>
	${p.name }
	
	
	
	
	
</body>
</html>