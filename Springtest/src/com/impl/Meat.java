package com.impl;

import javax.annotation.Resource;

import com.Food;

@Resource
public class Meat implements Food{

	private String color;
	private String weight;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
}
