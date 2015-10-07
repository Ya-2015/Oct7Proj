package Vehicle;

public class Truck extends Vehicle {
	public Truck(){
		System.out.println("A truck instance is created.");
	}
	
	public void start(){
		System.out.println("Truck starts...");
	}
	
	public void accelerate(){
		System.out.println("Truck accelerate...");
	}
	
	public void stop(){
		System.out.println("Truck stops...");
	}
	
	public void haulThings(){
		System.out.println("Truck hauls things...");
	}
}
