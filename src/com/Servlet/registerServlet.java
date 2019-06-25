package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Dao.*;;

public class registerServlet extends HttpServlet {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String logname=request.getParameter("logname");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String realname=request.getParameter("realname");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address");
		
		
		registerDao redao=new registerDao();
		boolean boo=false;
		if(logname.equals("")||password.equals("")){
			boo=false;
		}else{
			boo=redao.updata(logname, password, email, realname, phone, address);
		}
		
		
		if(boo){
			System.out.println("插入成功");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{
			System.out.println("插入失败");
			response.sendRedirect("register.jsp");
		}
	}

}
