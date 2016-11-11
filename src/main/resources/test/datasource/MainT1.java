package test.datasource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainT1 {
	
	public static void main(String[] args) throws SQLException {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-dataSource.xml");
		
		DataSource dataSource = (DataSource) ctx.getBean("dataSource2");
		System.out.println(dataSource.toString());
		
		Connection conn = (Connection) dataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("select * from user");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()){
			System.out.println(rs.getString("user"));
		}
		
		ps.close();
		conn = null;
	}
	
}
