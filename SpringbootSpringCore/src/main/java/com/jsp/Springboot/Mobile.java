package com.jsp.Springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile 
{
	@Value("Vivo")
	private String brand;
	@Value("20000")
	private double price;
	@Autowired
	private Display display;



	public Display getDisplay() {
		return display;
	}


	public void setDisplay(Display display) {
		this.display = display;
	}
	
	
}
