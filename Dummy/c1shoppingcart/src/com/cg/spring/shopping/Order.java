package com.cg.spring.shopping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Order {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Main c= (Main) context.getBean("main");
		//c.displayOrderedProducts();
		c.menu();

		
		
	}

}
