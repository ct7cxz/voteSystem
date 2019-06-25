package com.Servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Bean.userBean;
import com.Dao.loginDao;

public class loginServlet extends HttpServlet {

	
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
		System.out.println("servlet"+logname);
		System.out.println("servlet"+password);
		
		loginDao lodao=new loginDao();
		boolean boo=lodao.search(logname, password);
		HttpSession session=request.getSession();
		
		String[] bookIS=null;
		String[] bookNa=null;
		Float[] bookPr=null;
		
		if(boo){
			session.setAttribute("logname", logname);
			session.setAttribute("oldPassword", password);
			System.out.println("µÇÂ¼³É¹¦");
			response.sendRedirect("index.jsp");
		}else {
			System.out.println("µÇÂ¼Ê§°Ü");
			response.sendRedirect("login.jsp");
		}
		
		
	}

}
