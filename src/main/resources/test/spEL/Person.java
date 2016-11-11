package test.spEL;

import java.util.List;

public class Person {
	String name;
	String age;
	Car car;
	List cars;
	String info;
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
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + car
				+ ", cars=" + cars + "]";
	}
}
