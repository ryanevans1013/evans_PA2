import java.util.Scanner;

public class evans_p3 {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int i, j, rating, numPeople;
		
		
		String[] topics = {"Mexican", "American", "Chinese", "Italian", "Japanese"}; // array holding each topic to cycle through
		int [][] repsonses = new int  [5][10]; // array that holds responses for each topic
		
		
		System.out.println("How many people are answering this survey?");
		numPeople = scnr.nextInt();
		
		for(i = 0; i < numPeople; i++) // loops for every person in the survey
		{
			for(j = 0; j < 5; j++) // cycles through every topic 
			{
				System.out.println("Rate the following category of food from least (1) to greatest (10)");
				System.out.println("Rating for " + topics[j] +":");
				rating = scnr.nextInt();
				
				while(rating < 1 || rating > 10) // prompted if user gives rating outside of range
					{
						System.out.println("Invalid rating, please rate between 1 and 10");
						System.out.println("Rate the following category of food from least (1) to greatest (10)");
						System.out.println("Rating for " + topics[j] + ":");
						rating = scnr.nextInt();
					}
			}
			
		}		
		
	
	}
}