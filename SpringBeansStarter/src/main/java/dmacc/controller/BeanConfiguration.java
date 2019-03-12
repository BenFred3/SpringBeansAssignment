package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Menu;

@Configuration
public class BeanConfiguration 
{
	@Bean
	public Menu menu()
	{
		Menu bean = new Menu("Burger");
		return bean;
	}
}
