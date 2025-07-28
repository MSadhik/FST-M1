package Activities;

import Activities.activity7.BicycleOperations;
import Activities.activity7.BicycleParts;

class Bicycle implements BicycleParts,BicycleOperations {
	
	public int gears;
    public int currentSpeed;
      
 // Constructor
    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
        
    }
        
     // Implementing interface methods
        public void applyBrake(int decrement) {
            currentSpeed -= decrement;
            System.out.println("Brake applied. Current speed: " + currentSpeed);
        }

        public void speedUp(int increment) {
            currentSpeed += increment;
            System.out.println("Speed increased. Current speed: " + currentSpeed);
        }
        
     // Method to print description
        public String bicycleDesc() {
        	return("No of gears are "+ gears + "\nSpeed of bicycle is " + maxSpeed);
        }
}
	

