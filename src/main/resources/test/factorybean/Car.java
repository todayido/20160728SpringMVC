package test.factorybean;

public class Car {
	
	private String brand;
	
	public Car(){
		System.out.println("Car's constructor...");
	}
	
	public Car(String brand){
		this.brand = brand;
	}
	
	public void setBrand(String brand){
		System.out.println("set Brand");
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}
	
	public void init(){
		System.out.println("Car's init...");
	}
	
	public void destroy(){
		System.out.println("Car's destroy...");
	}

	public String toString() {
		return "Car [brand=" + brand + "]";
	}
}
