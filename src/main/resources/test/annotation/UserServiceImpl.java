package test.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRespository userRespository;
	
	public void add() {
		userRespository.save();
	}

}
