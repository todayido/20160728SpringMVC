package tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("bookDaoImpl")
public class BookDaoImpl implements BookDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//根据bookId查询书的价格
	public int getPriceByBookId(String bookId) {
		String sql = "select price from book where bookid=?";
		return jdbcTemplate.queryForObject(sql, Integer.class, bookId);
	}

	//更新书的数量
	public void updateStock(String bookId) {
		String sql = "update book_stock set stock=stock-1 where bookid=?";
		jdbcTemplate.update(sql, bookId);
	}
	
	//查询用户余额
	public int getUserAccount(String userId){
		String sql = "select account from user where userid = ?";
		return jdbcTemplate.queryForObject(sql, Integer.class, userId);
	}
	
	//查询用户余额
		public int getUserAccountByUserName(String username){
			String sql = "select account from user where username = ?";
			return jdbcTemplate.queryForObject(sql, Integer.class, username);
		}

	//更新用户的余额
	public void updateUserAccount(String username, int account) {
		String sql = "select account from user where username = ?";
		int yue =  jdbcTemplate.queryForObject(sql, Integer.class, username);
		if(yue<account){
			throw new BookException("余额不足，请充值！");
		}
		System.out.println(account+"=============================");
		sql = "update user set account=account-? where username=?";
		jdbcTemplate.update(sql, account, username);
	}


}
