package test.di;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {

	@Autowired
	protected BaseRespository<T> baseRespository;
	
	public void add(){
		System.out.println("add...");//add...
		System.out.println(baseRespository);//test.di.UserRespository@ea84494
	}
}
