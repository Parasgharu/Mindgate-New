package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Product;

public class ProductMain {

	public static void main(String[] args) {
		System.out.println("main Start");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Application contex created");
		Product product = applicationContext.getBean("product", Product.class);
		System.out.println("Product Created");
		System.out.println(product);
		System.out.println(product.hashCode());
		
		System.out.println("-".repeat(50));
		
		Product product2 = applicationContext.getBean("product", Product.class);
		System.out.println("Product Created");
		System.out.println(product2);
		System.out.println(product2.hashCode());
		System.out.println("Main Ends");

	}

}
