package Vehicle;

public class Train extends Vehicle{
	public Train(){
		System.out.println("A train instance is created.");
	}
	
	public void start(){
		System.out.println("Train starts...");
	}
	
	public void accelerate(){
		System.out.println("Train accelerate...");
	}
	
	public void stop(){
		System.out.println("Train stops...");
	}
	
	public void whistle(){
		System.out.println("Train whistling...");
	}
}
