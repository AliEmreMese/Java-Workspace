import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) throws IOException {	
		Scanner reader = new Scanner(System.in); //Creates an object to read user input
		Random rand = new Random(); //Creates an object from Random class
		int number =rand.nextInt(100); //generates a number between 0 and 99
		int attemps = 0;
		
		
		System.out.println("Hi! I'm thinking of a number between 0 and 99.");
		System.out.print("Can you guess it: ");
		
		do {
			int guess = reader.nextInt(); //Read the user input

			attemps += 1;
			

			if (guess == -1) {
				System.out.println("Sorry, the number was: " + number);
				break;
			}else if (guess == number){
				System.out.println("Congratulations! You won after " + attemps +" attemps");
				break;
			} else {
				System.out.println("Sorry!");
				if (guess > number) {
					System.out.println("Mine is less than your guess!");
				} else {
					System.out.println("Mine is greater than your guess!");
				}
				System.out.println("Type -1 to quit or guess another: ");
			}
		
		} while(true);

		reader.close(); //Close the resource before exiting
	}
	
	
}