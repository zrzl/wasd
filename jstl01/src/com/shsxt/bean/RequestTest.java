package com.shsxt.bean;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestTest
 */
@WebServlet("/requestTest")
public class RequestTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getRequestURI());
		System.out.println(request.getRequestURL().toString());
		System.out.println(request.getMethod());
		System.out.println(request.getProtocol());
		System.out.println(request.getContextPath());
		//response.setHeader("refresh", "3;url=http://www.baidu.com");
		response.sendError(305, "网页升级中");	
	}

}
