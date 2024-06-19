package com.jsp.Springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Display 
{
	@Value("7.6")
	private double size;

	@Override
	public String toString() {
		return "Display [size=" + size + "]";
	}
	
}
