import java.util.Scanner;

public class evans_p2 {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		float pounds, kilos, inches, centimeters, bmi;
		
		System.out.println("Standard (Enter 1) or Metric (Enter 2) calculations?");
		
		if(scnr.nextInt() == 1) // standard BMI calculations 
		{
			System.out.println("You have chosen Standard");
			System.out.println("What is your height in inches?");
			inches = scnr.nextInt();
			
			System.out.println("What is your weight in pounds?");
			pounds = scnr.nextInt();
			
			bmi = (703 * pounds) / (inches * inches);
			System.out.println("Your BMI is: " + bmi);
			
			if(bmi < 18.5)
			{
				System.out.println("You are underweight");
			}
			else if(bmi <= 24.9)
			{
				System.out.println("You are normal weight");
			}
			else if(bmi <= 29.9)
			{
				System.out.println("You are overweight");
			}
			else if(bmi >= 30)
			{
				System.out.println("You are obese");
			}
		}
		else if(scnr.nextInt() == 2) // Metric BMI calculations 
		{
			System.out.println("You have chosen metric");
			System.out.println("What is your height in centimeters?");
			centimeters = scnr.nextInt();
			
			System.out.println("What is your weight in kilograms?");
			kilos = scnr.nextInt();
			
			bmi = kilos / (centimeters * centimeters) * 10000;
			System.out.println("Your BMI is: " + bmi);
			
			if(bmi < 18.5)
			{
				System.out.println("You are underweight");
			}
			else if(bmi <= 24.9)
			{
				System.out.println("You are normal weight");
			}
			else if(bmi <= 29.9)
			{
				System.out.println("You are overweight");
			}
			else if(bmi >= 30)
			{
				System.out.println("You are obese");
			}
		}
		else if(scnr.nextInt() != 1 || scnr.nextInt() != 2) // Prompted if user selected invalid input
		{
			System.out.println("Invalid option!");
		}
		
	}

}
