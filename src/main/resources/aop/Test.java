package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("beans-aop.xml");
		
		Calculator calculator = (Calculator)act.getBean("calculatorImpl");
		calculator.div(6, 2);
	}

}
