package jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import junit.framework.TestCase;

public class JDBCTest extends TestCase {

	private ApplicationContext act = null;
	private JdbcTemplate jdbcTemplate = null;
	
	{
		act = new ClassPathXmlApplicationContext("beans-jdbc.xml");
		jdbcTemplate = (JdbcTemplate) act.getBean("jdbcTemplate");
	}
	
	
	public List get(){
		return jdbcTemplate.queryForList("select * from user");
	}
	
	public void test(){
		List list = get();
		System.out.println(list.get(0).toString());
	}
	
	
}
