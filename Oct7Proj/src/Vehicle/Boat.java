package Vehicle;

public class Boat extends Vehicle{
	public Boat(){
		System.out.println("A boat instance is created.");
	}
	
	public void start(){
		System.out.println("Boat starts...");
	}
	
	public void accelerate(){
		System.out.println("Boat accelerate...");
	}
	
	public void stop(){
		System.out.println("Boat stops...");
	}
	
	public void canoe(){
		System.out.println("Canoeing...");
	}
}
