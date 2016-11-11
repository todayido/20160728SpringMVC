package test.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Test {
	public static void main(String[] args) {
		
		ApplicationContext atc = new ClassPathXmlApplicationContext("beans-annotation.xml");
		
		UserController userController=(UserController) atc.getBean("userController");
		
		System.out.println(userController.getClass());
		userController.add();
		
	}
}
