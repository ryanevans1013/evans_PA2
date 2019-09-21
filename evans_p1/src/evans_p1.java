import java.util.Scanner;
		
public class evans_p1 {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int a, b, c, d;
		
		System.out.println("Enter in 4 Digits:");
		
		a = scnr.nextInt();
		b = scnr.nextInt();
		c = scnr.nextInt();
		d = scnr.nextInt();
		
		int newA, newB, newC, newD;
		
		newA = (a + 7) % 10;				
		newB = (b + 7) % 10;				
		newC = (c + 7) % 10;				
		newD = (d + 7) % 10;	
		
		int encrA = newC;
		int encrB = newD;
		int encrC = newA;
		int encrD = newB;

		System.out.println(encrA);
		System.out.println(encrB);
		System.out.println(encrC);
		System.out.println(encrD);
		
	}
}
