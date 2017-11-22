package com.shsxt.bean;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//用于绘制图片
		BufferedImage bi=new BufferedImage(80, 30, BufferedImage.TYPE_INT_RGB);
		//获取绘图工具
		Graphics graphics=bi.getGraphics();
		graphics.setColor(new Color(100, 230, 200));
		graphics.fillRect(0, 0, 80, 30);
		
		//验证码中所使用的字符
		char[] codeChar="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
		String captcha="";//用于存放生成的验证码
		Random random=new Random();
		for (int i = 0; i < 5; i++) {
			int index=random.nextInt(codeChar.length);
			//设置字体颜色
			graphics.setColor(new Color(random.nextInt(150), random.nextInt(200), random.nextInt(255)));
			//画验证码
			graphics.drawString(captcha, 15, 20);;
			captcha+=codeChar[index];
		}
		request.getSession().setAttribute("code", captcha);
		//通过ImageIO将图片输出
		ImageIO.write(bi, "JPG", response.getOutputStream());
		
		
		
	}

}
