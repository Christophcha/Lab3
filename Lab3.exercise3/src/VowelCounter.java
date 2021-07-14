import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		
		String input;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter a string");
		input = scan.nextLine();
		
		int aCounter = 0;
		int eCounter = 0;
		int iCounter = 0;
		int oCounter = 0;
		int uCounter = 0;
		int nonVowelSum = 0;
		//input = input.replace(" ", "");
		//input = input.replace("?", "");
		//input = input.replace(".", "");
		//input = input.replace("!", "");
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == 'a')
				aCounter++;
			else if(input.charAt(i) == 'e')
				eCounter++;
			else if(input.charAt(i) == 'i')
				iCounter++;
			else if(input.charAt(i) == 'o')
				oCounter++;
			else if(input.charAt(i) == 'u')
				uCounter++;
			else if(Character.isAlphabetic(input.charAt(i)))
				nonVowelSum++;
			}
		
		System.out.println("There are " + aCounter + " a's.");
		System.out.println("There are " + eCounter + " e's.");
		System.out.println("There are " + iCounter + " i's.");
		System.out.println("There are " + oCounter + " o's.");
		System.out.println("There are " + uCounter + " u's.");
		System.out.println("There are " + nonVowelSum + " non vowels.");
		}

	}
