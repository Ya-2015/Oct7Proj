package Vehicle;

public class Plane extends Vehicle {
	public Plane(){
		System.out.println("A plane instance is created.");
	}
	
	public void start(){
		System.out.println("Plane starts...");
	}
	
	public void accelerate(){
		System.out.println("Plane accelerate...");
	}
	
	public void stop(){
		System.out.println("Plane stops...");
	}
	
	public void fly(){
		System.out.println("Plane flys...");
	}
}
