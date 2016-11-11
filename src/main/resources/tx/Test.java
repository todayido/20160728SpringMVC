package tx;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class Test extends TestCase {

	private ApplicationContext act;
	private BookDao bookDao;
	private BookService bookService;
	private BookCashierService bookCashierService;
	
	{
		act = new ClassPathXmlApplicationContext("beans-tx.xml");
		bookDao = act.getBean(BookDao.class);
		bookService = act.getBean(BookService.class);
		bookCashierService = act.getBean(BookCashierService.class);
	}
	
	public void test(){
		bookService.buyByUserName("zhangsan", "1001");
	}
	
	public void textTX(){
		bookCashierService.buyMoreByUserName("zhangsan", Arrays.asList("1001","1002"));
	}
}
