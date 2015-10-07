package Car;

public class CarApp {
	public static void main(String[] args) {
		Car car = new Car(70, "Honda", "yellow");
		
		car.getDescription();
		car.start();
		car.getCurrentSpeed();
		car.accelerate();
		car.getCurrentSpeed();
		car.decelerate();
		car.stop();
		
		System.out.println();
		Car car2 = new Car(120, "BMW", "blue");
		
		car2.getDescription();
		car2.start();
		car2.getCurrentSpeed();
		car2.accelerate();
		car2.getCurrentSpeed();
		car2.decelerate();
		car2.stop();
	}
	
}
