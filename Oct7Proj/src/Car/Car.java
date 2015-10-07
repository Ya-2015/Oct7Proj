package Car;

public class Car {
	private int speed;
	private String model;
	private String color;
	private final int SPEED_STEP = 10;
	
	public Car(int speed, String model, String color){
		this.speed = speed;
		this.model = model;
		this.color = color;
	}
	
	public Car(){
		this.setSpeed(speed);
		this.setModel(model);
		this.setColor(color);
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public void setSpeed(int speed){
		this.speed = speed;
	}
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void getCurrentSpeed() {
		System.out.print(String.format("The car is going %d mph.\n", speed));
	}
	
	public void getDescription(){
		System.out.print(String.format("This car is a %s %s.\n", color, model));
	}
	
	public void start(){
		System.out.printf("The car is starting.\n");
	}
	
	public void accelerate(){
		speed += SPEED_STEP;
		System.out.printf("The car is accelerating.\n");
	}
	
	public void decelerate(){
		if ((speed-SPEED_STEP) > 0){
			speed -= SPEED_STEP;
		}else{
			speed = 0;
		}
		
		System.out.printf("The car is slowing down.\n");
	}
	

	public void stop(){
		speed = 0;
		System.out.printf("The car has stopped.\n");
	}


}
