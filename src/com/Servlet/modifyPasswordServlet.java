package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.modifyPasswordDao;

public class modifyPasswordServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String logname=new String();
		String oldPassword=request.getParameter("oldPassword");
		String newPassword1=request.getParameter("newPassword1");
		String newPassword2=request.getParameter("newPassword2");
		
		HttpSession session=request.getSession();
		oldPassword=(String) session.getAttribute("oldPassword");
		logname=(String) session.getAttribute("logname");
		
		boolean boo;
		boo=modifyPasswordDao.search(logname, oldPassword);
		
		if(boo){
			if(newPassword1.equals(newPassword2)){
				modifyPasswordDao.updata(logname, newPassword1);
				System.out.println("修改成功");
				request.getRequestDispatcher("modifyPassword.jsp").forward(request, response);
			}
		}else{
			System.out.println("修改失败");
		}
		
		
	
	}

}
