package test.factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainT {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factory.xml");
		
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		
	}
	
}
