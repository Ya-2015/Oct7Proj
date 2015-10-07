package Vehicle;

public class Tester {
	public static void main(String[] args) {
		Vehicle vehicle = new Car();
		vehicle.start();
		vehicle.accelerate();
		vehicle.stop();

		
		System.out.println();
		Car car = (Car)vehicle;
		car.start();
		car.accelerate();
		car.stop();
		car.carryPassengers();
		
		System.out.println();
		Truck truck = new Truck();
		truck.start();
		truck.accelerate();
		truck.stop();
		truck.haulThings();
		
		System.out.println();
		Boat boat = new Boat();
		boat.start();
		boat.accelerate();
		boat.stop();
		boat.canoe();
		
		System.out.println();
		Train train = new Train();
		train.start();
		train.accelerate();
		train.stop();
		train.whistle();
		
		System.out.println();
		Plane plane = new Plane();
		plane.start();
		plane.accelerate();
		plane.stop();
		plane.fly();
	}
	
}
