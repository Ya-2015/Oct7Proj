package Vehicle;

public class Car extends Vehicle{
	public Car(){
		System.out.println("A car instance is created.");
	}
	
	public void start(){
		System.out.println("Car starts...");
	}
	
	public void accelerate(){
		System.out.println("Car accelerate...");
	}
	
	public void stop(){
		System.out.println("Car stops...");
	}
	
	public void carryPassengers(){
		System.out.println("Car carries passengers...");
	}
}
