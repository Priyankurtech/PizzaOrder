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

@WebServlet("/createorder")
public class CreateOrder extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Dao dao = new Dao();
		/*
		 * String name=req.getParameter("name"); long
		 * phone=Long.parseLong(req.getParameter("phoneno")); String pizzatype=
		 * req.getParameter("pizzatype"); String
		 * ingredients=req.getParameter("ingredients"); String
		 * size=req.getParameter("size"); double
		 * price=Double.parseDouble(req.getParameter("price")); String
		 * status=req.getParameter("status");
		 */
		Pizza pizza = new Pizza();
		pizza.setName("Priyankur");
		pizza.setPhoneno(814511456);
		pizza.setPizzatype("cheese");
		pizza.setIngredients("pasta");
		pizza.setSize("small");
		pizza.setPrice(456.98);
		pizza.setStatus("placed");

		dao.save(pizza);
		resp.getWriter().print("<h1>order placed</h1>");

	}
}
