package txxml;

import java.util.List;

public interface BookService {
	public void buy(String userId, String bookId);
	public void buyByUserName(String username, String bookId);
}
