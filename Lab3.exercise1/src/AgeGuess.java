  
import java.util.Random;
import java.util.Scanner;

public class AgeGuess {

	public static void main(String[] args) {
		
		Random randomNumber = new Random();
		
		int age = randomNumber.nextInt(100); //Gives age a random number 0-100
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is my age?"); //Prompts the user to guess my age
		
		while(age != scan.nextInt()) {
			System.out.println ("Guess again!");
		}
		
		System.out.println ("Good Job!");
		
		scan.close();
	}

}