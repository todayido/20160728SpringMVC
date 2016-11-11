package test.annotation;

import org.springframework.stereotype.Repository;

@Repository
public class UserRespositoryImpl implements UserRespository{

	public void save() {
		System.out.println("User is saved ...");
	}
	
}
