package com.shsxt.bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthImageServlet
 */
@WebServlet("/verify")
public class AuthImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthImageServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doPost(req, resp);
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*response.setHeader("Pragma", "No-cache"); 
        response.setHeader("Cache-Control", "no-cache"); 
        response.setDateHeader("Expires", 0); 
        response.setContentType("image/jpeg"); 
           
        //生成随机字串 
        String verifyCode = VerifyCodeUtils.generateVerifyCode(4); 
        //存入会话session 
        HttpSession session = request.getSession(true); 
        //删除以前的
        session.removeAttribute("verCode");
        session.setAttribute("verCode", verifyCode.toLowerCase()); 
        //生成图片 
        int w = 100, h = 30; 
        VerifyCodeUtils.outputImage(w, h, response.getOutputStream(), verifyCode); */
		  response.setContentType("text/html;charset=utf-8");         
	         String validateC = (String) request.getSession().getAttribute("validateCode");         
	         String veryCode = request.getParameter("c");         
	         PrintWriter out = response.getWriter();         
	         if(veryCode==null||"".equals(veryCode)){         
	             out.println("验证码为空");         
	         }else{         
	             if(validateC.equals(veryCode)){         
	                 out.println("验证码正确");         
	             }else{         
	                 out.println("验证码错误");         
	             }         
	         }         
	         out.flush();         
	         out.close();         
	}

}
