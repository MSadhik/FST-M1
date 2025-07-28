package Activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
	//fields
    public List<String> passengers;
    public int maxPassengers;
    public Date lastTimeTookOf;
    public Date lastTimeLanded;
    
    //Constructor
    public Plane(int maxPassengers) {
    this.maxPassengers = maxPassengers;
    this.passengers = new ArrayList<>();
    }
    
    //Add passenger
    public void onboard(String passengerName) {
    	if(passengers.size() <= maxPassengers) {
            this.passengers.add(passengerName);
    } else {
    	System.out.println("Plane is full");
    }
    }
    
    //takeoff and return the takeoff time
    public Date takeOff() {
    	this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }
    //Land the plane,clear passengers
    public void land() {
    	this.lastTimeLanded = new Date();
    	this.passengers.clear();
    	
    }
    //last landing time
    public Date getLastTimeLanded() {
    	this.lastTimeLanded = new Date();
    	return lastTimeLanded;
    }
    //passengers list
    public List<String> getPassesngers() {
    	return passengers;
    }

}
