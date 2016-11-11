package test.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	public void add(){
		userService.add();
	};
}
