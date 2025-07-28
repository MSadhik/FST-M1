package Activities;

public class Car {
	
	String color;
	String transmission;
	int make;
	int tyres = 4;
	int doors = 4;
	
	public Car(String color, String transmission, int make) {
	
		this.color = color;
		this.transmission = transmission;
		this.make = make;
		
	}
	
	public void displaycharacteristics() {
		
		System.out.println("This color is:"+ color);
		System.out.println("This transmission type is: "+ transmission);
		System.out.println("This car was mede in: "+ make);
		System.out.println("It has "+doors + "doors");
		System.out.println("It has "+tyres + "tyres");
	}
	
	public void accelarte() {
		System.out.println("The car is moving forward");
	}
	
	public void brake() {
		System.out.println("The car has stopped");
	}
}
