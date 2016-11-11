package test.com;

import java.util.List;

public class Person {
	String name;
	String age;
	Car car;
	List cars;
	public List getCars() {
		return cars;
	}
	public void setCars(List cars) {
		this.cars = cars;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	public String toString(){
		return name+" " + car.toString();
	}
	
	public String toString2() {
		String a = "";
		for(int i=0; i<cars.size(); i++){
			Car c = (Car)cars.get(i);
			a = a + c.toString();
		}
		return name + "Car ["+a+"]";
	}
	
}
