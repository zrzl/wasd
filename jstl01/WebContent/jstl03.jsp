<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:forEach var="i" begin="1" end="10" step="1"> 
	${i}<br/> 
</c:forEach>

<hr/>

<% 
	List list=new ArrayList(); 
	for(int i=0;i<10;i++){ 
		list.add("A:"+i); 
	} 
	pageContext.setAttribute("li", list); 
%>
		<%-- <c:forEach items="${li }" var="temp" varStatus="idx">
			${temp} ->
			${idx.index }->
			${idx.count }->
			${idx.first }->
			${idx.last }
			<br/>
		</c:forEach> --%>
<hr/>
	<table border="1px" align="center">
		<tr>
			<td>List内容</td>
			<td>当前下标</td>
			<td>成员总数</td>
			<td>是/否 first成员</td>
			<td>是/否 last成员</td>
		</tr>
		
		<c:forEach items="${li }" var="temp" varStatus="idx">
			<tr>
				<td>${temp }</td>
				<td>${idx.index }</td>
				<td>${idx.count }</td>
				<td>${idx.first }</td>
				<td>${idx.last }</td>
			</tr>
		
		</c:forEach>
	
	
	</table>

<hr/>
<c:forTokens items="google,chrome,ie" delims="," var="name"> 
	<p> ${name }</p> 
</c:forTokens>






</body>
</html>









