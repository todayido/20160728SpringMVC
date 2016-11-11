package txxml;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class Test extends TestCase {

	private ApplicationContext act;
	private BookService bookService;
	private BookCashierService bookCashierService;
	
	{
		act = new ClassPathXmlApplicationContext("beans-tx-xml.xml");
		bookService = act.getBean(BookService.class);
		bookCashierService = act.getBean(BookCashierService.class);
	}
	
	//买一本书
	public void test(){
		bookService.buyByUserName("zhangsan", "1001");
	}
	
	//买两本书
	public void textTX(){
		bookCashierService.buyMoreByUserName("zhangsan", Arrays.asList("1001","1002"));
	}
}
