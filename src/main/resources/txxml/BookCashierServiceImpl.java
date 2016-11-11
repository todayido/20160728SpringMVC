package txxml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookCashierServiceImpl implements BookCashierService{

	@Autowired
	private BookDao bookDao;
	
	@Autowired
	private BookService bookService;
	
	public void buyMoreByUserName(String username, List<String> list) {
		for(String bookId:list){
			System.out.println(bookId+"===========================");
			bookService.buyByUserName(username, bookId);
		}
	}

}
