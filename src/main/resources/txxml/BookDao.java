package txxml;

public interface BookDao {
	public int getPriceByBookId(String bookId);
	public void updateStock(String bookId);
	public void updateUserAccount(String userId, int account);
	public int getUserAccount(String userId);
	public int getUserAccountByUserName(String username);
}
