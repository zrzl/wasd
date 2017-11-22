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

import com.sun.org.apache.bcel.internal.generic.Type;

/**
 * Servlet implementation class Test1
 */
@WebServlet("/test1")
public class Test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BufferedImage bi=new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);
		Graphics g=bi.getGraphics();
		g.setColor(new Color(200, 200, 250));
		g.fillRect(0, 0, 200, 200);
	
		String code="";
		String str="abcdefghijklmnoqprstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random rd=new Random();
		for (int i = 0; i < 4; i++) {
			code+=str.charAt(rd.nextInt(str.length()));
			g.setColor(Color.blue);
			g.drawString(code, 100, 150);
		}
		request.getSession().setAttribute("code", code);
		ImageIO.write(bi, "jpg", response.getOutputStream());
	}

}
