package test.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainDataSource {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource ds = (DataSource) act.getBean("dataSource");
		
		System.out.println(ds.toString());

	}

}
