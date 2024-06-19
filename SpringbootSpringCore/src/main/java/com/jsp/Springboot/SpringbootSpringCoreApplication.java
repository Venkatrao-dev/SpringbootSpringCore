package com.jsp.Springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootSpringCoreApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringbootSpringCoreApplication.class, args);
		
		
			Mobile m1=context.getBean(Mobile.class);
			System.out.println(m1);
			System.out.println(m1.getDisplay());
	}

}
