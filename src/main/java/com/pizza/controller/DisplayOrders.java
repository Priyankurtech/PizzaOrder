package com.pizza.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pizza.dao.Dao;
import com.pizza.dto.Pizza;

@WebServlet("/displayorder")
public class DisplayOrders extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Dao dao = new Dao();
		if (dao.fetchAlltask() == null) {
			resp.getWriter().print("<h1>No Order is placed as of now</h1>");
		} else {
			List<Pizza> order = dao.fetchAlltask();
			req.setAttribute("orders", order);
			req.getRequestDispatcher("displayorder.jsp").forward(req, resp);
		}
	}
}
