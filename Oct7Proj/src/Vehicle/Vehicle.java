package Vehicle;

public abstract class Vehicle {
	public Vehicle(){
		System.out.println("A vehicle instance is created.");
	}
	
	public void start(){
		System.out.println("Vehicle starts...");
	}
	
	public void accelerate(){
		System.out.println("Vehicle accelerate...");
	}
	
	public void stop(){
		System.out.println("Vehicle stops");
	}
}
