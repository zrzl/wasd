package com.shsxt.bean;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/checkCode")
public class CheckCodeServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // 获取存放在session中的验证码
        String code = (String) req.getSession().getAttribute("code");
        // 获取页面提交的验证码
        String inputCode = req.getParameter("code");
        if(code.toLowerCase().equals(inputCode.toLowerCase())) { // 验证码不区分大小写
            // 验证成功，跳转到成功页面
            req.getRequestDispatcher("/success.jsp").forward(req, resp);
        } else { // 验证失败
            req.getRequestDispatcher("/fail.jsp").forward(req, resp);
        }
    }

}