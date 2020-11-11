package com.example.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.Search;

import com.example.dao.*;
import com.example.model.*;
import com.example.util.*;



public class InsertItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Productsdao pdDao;
	
	public void init() {
		pdDao = new Productsdao();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			insertProduct(request, response);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	private void insertProduct(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		try {
			String barcode = request.getParameter("barcode");
			String name = request.getParameter("name");
			String color = request.getParameter("color");
			String des = request.getParameter("description");
			
			Product newpr = new Product(Integer.parseInt(barcode), name, color, des);
			if(pdDao.findBarcode(Integer.parseInt(barcode)) == true) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("/fail.jsp");
				dispatcher.forward(request, response);
			}else {
				pdDao.saveProduct(newpr);
				RequestDispatcher dispatcher = request.getRequestDispatcher("/success.jsp");
				dispatcher.forward(request, response);
			}
		}catch(Exception exc){
			exc.printStackTrace();
		}
	}
}
