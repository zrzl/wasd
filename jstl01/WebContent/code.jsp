<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆页面</title>
<script type="text/javascript">
    function flushCode() {
    // 每次刷新的时候获取当前时间，防止浏览器缓存刷新失败
    var time = new Date();
    document.getElementById("scode").src = "<%=request.getContextPath()%>/test1?time="
				+ time;
	}
</script>
</head>
<body>
	<form action="<%=request.getContextPath()%>/checkCode" method="post">
		请输入验证码：<input type="text" name="code"> <input type="submit"
			value="确定">
	</form>
	<img alt="验证码" id="scode" src="<%=request.getContextPath()%>/test1">
	<a href="#" onclick="javascript:flushCode();">看不清?</a>
</body>
</html>