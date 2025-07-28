package Activities;

public class activity2 {

	public static void main(String[] args) {
		//Given array
		int[] numbers = {10, 77, 10, 54, -11, 10};
		
		//Total sum of 10s
		int sum = 0;
		
		//iterate the array to find 10s
		for (int num : numbers) {
			//Check the number is 10
            if (num == 10) {
            //add value to sum
                sum += num;
            }
            
            //to prevent extra iterate
            if(sum>30) {
            	break;
            }
        }

		//Check the sum value
		if (sum==30) {
			System.out.println("Sum value is: "+ sum);
		}
		else {
			System.out.println("Sum value is not 30");
		}
	}

}
