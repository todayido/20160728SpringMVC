package aopxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aopxml.Calculator;

public class Test {

	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("beans-aop-xml.xml");
		
		Calculator calculator = (Calculator)act.getBean("calculatorImpl");
		System.out.println(calculator.div(6, 1)); 
	}

}
