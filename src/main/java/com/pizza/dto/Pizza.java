package com.pizza.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Pizza {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int OrderId;
	String name;
	long phoneno;
	String pizzatype;
	String ingredients;
	String size;
	double price;
	String status;

}
