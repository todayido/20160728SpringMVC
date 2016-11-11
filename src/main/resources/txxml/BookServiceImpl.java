package txxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDao bookDao;
	
	public void buy(String userId, String bookId) {
		
	}
	
	public void buyByUserName(String username, String bookId) {
		int price = bookDao.getPriceByBookId(bookId);
		int account = bookDao.getUserAccountByUserName(username);
		
		// 库存-1
		bookDao.updateStock(bookId);
		// 用户余额=当前金额-书的价格
		bookDao.updateUserAccount(username, price);
	}

}
