<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.shsxt.bean.Person"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setAttribute("per",new Person());
%>

<c:set var="n" target="${per}" property="name" value="lisi" scope="session" >
</c:set>
${n }

<hr/>

<% 
	session.setAttribute("name", "shsxt"); 
	request.setAttribute("name", "bjsxt");
	pageContext.setAttribute("name", "sjsxt");
	application.setAttribute("name", "pdsxt");
%>
${name } ---
<c:remove var="name" scope="page"/>
${name }
<hr/>

	<c:if test="${'1==1' }" var="resu" />
	${resu }
	${'1==1' }
	<br/>
	<%
		request.setAttribute("num", 1);
	%>
	
	<c:if test="${num==1 }" var="resu"/>
	${resu }
	<br/>
	<%
		request.setAttribute("str", "lss is a girl");
	%>
	<c:if test="${str=='lss is a beautiful girl' }">
		<h1>我好喜欢lss</h1>
	</c:if>
	<c:if test="${str!= 'lss is a beautiful girl'}">
		<h1>也没辣么喜欢了</h1>
	</c:if>
	<hr/>
	<% 
		request.setAttribute("num", 5); 
	%>
	
	<c:choose>
		<c:when test="${num==4 }">
			num 的值 4
		</c:when>
		<c:when test="${num==3 }">
			num 的值 3
		</c:when>
		<c:otherwise>
			不知道
		</c:otherwise>
	
	</c:choose>
	
	
</body>
</html>