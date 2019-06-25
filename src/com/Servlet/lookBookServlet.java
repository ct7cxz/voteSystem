package com.Servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.lookBookDao;

public class lookBookServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<String> bookISBN=new LinkedList<String>();
		List<String> bookName=new LinkedList<String>();
		List<Float> bookPrice=new LinkedList<Float>();
		List<Integer> bookNum=new LinkedList<Integer>();
		
		ResultSet resultSet=null;
		
		resultSet=lookBookDao.getSearch();
		
		try {
			while(resultSet.next()){
				bookISBN.add(resultSet.getString("bookISBN"));
				bookName.add(resultSet.getString("bookName"));
				bookPrice.add(resultSet.getFloat("bookPrice"));
			}
			String[] bookIS=bookISBN.toArray(new String[0]);
			String[] bookNa=bookName.toArray(new String[0]);
			Float[] bookPr=bookPrice.toArray(new Float[0]);
			
			HttpSession session=request.getSession();
			session.setAttribute("buybookISNB", bookIS);
			session.setAttribute("buybookName",bookNa );
			session.setAttribute("buybookPrice", bookPr);
			
			for(String isbn:bookIS){
				bookNum.add(Integer.parseInt(request.getParameter(isbn)));
			}
			
			Integer[] bookNu=bookNum.toArray(new Integer[0]);
			
			session.setAttribute("buybookNum", bookNu);
			
			request.getRequestDispatcher("lookPurchase.jsp").forward(request, response);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
