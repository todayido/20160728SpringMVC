package tx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDao bookDao;
	
	public void buy(String userId, String bookId) {
		
	}
	
	//@Transactional(propagation=Propagation.REQUIRES_NEW)
	@Transactional(propagation=Propagation.REQUIRED)
	public void buyByUserName(String username, String bookId) {
		int price = bookDao.getPriceByBookId(bookId);
		int account = bookDao.getUserAccountByUserName(username);
		
		// 库存-1
		bookDao.updateStock(bookId);
		// 用户余额=当前金额-书的价格
		bookDao.updateUserAccount(username, price);
	}

}
