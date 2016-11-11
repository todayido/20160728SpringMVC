package test.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("beans-di.xml");
		UserService userService = (UserService) act.getBean("userService");
		
		userService.add();
	}

}
