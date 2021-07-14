import java.util.Scanner;

public class EvenNumSum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int inputValue;
		
		
		System.out.println("Please enter a number:");
		inputValue = scan.nextInt();
		
		while(inputValue < 2) {
			System.out.println("Please enter a number 2 or greater");
			inputValue = scan.nextInt();
		}
		
		if(inputValue >= 2) {
			System.out.println("All even numbers between 0 and " + inputValue + " is: ");
			
			for (int i = 2; i <= inputValue; i += 2) 
				System.out.println(i);
		}
	}
}
