package test.factory;

import java.util.HashMap;
import java.util.Map;

public class CarStaticFactory {

	private static Map<String, Car> cars = new HashMap();
	
	static{
		cars.put("audi", new Car("audi"));
		cars.put("ford", new Car("ford"));
	}
	
	public static Car getCar(String name){
		return cars.get(name);
	}
	
}
