package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.modifyRegisterDao;

public class modifyRegisterServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		String logname;
		HttpSession session=request.getSession();
		logname=(String) session.getAttribute("logname");
		
		
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		String realname=request.getParameter("realname");
		String address=request.getParameter("address");
		
		modifyRegisterDao.updata(logname, phone, email, realname, address);
		
		request.getRequestDispatcher("modifyRegister.jsp").forward(request, response);
	}

}
