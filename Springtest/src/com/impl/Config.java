package com.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.Animal;

@ComponentScan(basePackages="com.impl")
public class Config {

	@Bean
	public Animal dog(){
		return new Dog();
	}
}
