package com.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.Animal;
import com.Food;

public class Dog implements Animal{

	@Autowired
	private Food meat;
	@Value("${name}")
	private String name;
	@Value("#{test['id']}")
	private Integer id;
	@Override
	public void eat(Food food) {
		System.out.println(name+">>"+id);
		System.out.println("eat..." + food.getClass().getName());
	}
	@Override
	public void eat() {
		eat(meat);
	}
}
