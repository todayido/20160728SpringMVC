package test.circle;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainT {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-circle.xml");
		
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		
		// 关闭ioc容器
		ctx.close();
		
	}
	
}
