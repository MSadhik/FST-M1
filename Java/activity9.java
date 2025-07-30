package Activities;

import java.util.ArrayList;

public class activity9 {

	public static void main(String[] args) {
		
		// Create an HashSet
		ArrayList<String> myList = new ArrayList<>();
		
		// Add 5 names
		myList.add("Sadhik");
        myList.add("Jafi");
        myList.add("Sana");
        myList.add("Safa");
        myList.add("Batsha");
        
     // Print all names using a for loop
        System.out.println("Names in the list: ");
        
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
	}
    
     // Use get() method to retrieve the 3rd name
        String thirdName = myList.get(2);
        System.out.println("\nThe 3rd name in the list is: " + thirdName);

     // Use contains() to check if "Safa" exists in the list
        boolean hasSafa = myList.contains("Safa");
        System.out.println("\nIs 'Safa' in the list? " + hasSafa);

    // Use size() to print the number of names
        System.out.println("\nNumber of names in the list: " + myList.size());
        
    // Use remove() to remove "Batsha" and print size again
        myList.remove("Batsha");
        System.out.println("\nRemoved 'Batsha' from the list.");
        System.out.println("New number of names in the list: " + myList.size());
	}
}
