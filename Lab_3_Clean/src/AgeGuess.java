
//**************************************************************************************************************
//
//  AgeGuess.java		Author: Fischer
//
//  Takes the user's name as input; has user guess an age between 0 and 100; gives user
//  hints to guess older or younger.
//**************************************************************************************************************
import java.util.Scanner;
import java.util.Random;
import org.apache.commons.lang3.StringUtils;

public class AgeGuess {

	public static void main(String[] args) {
		// Declares a new int variable num and initializes num to a random integer
		// between 0 and 100 (inclusive).
		int age;
		int age_Guess;
		String name = "";
		Random gen = new Random();
		age = gen.nextInt(101);
		Scanner scan = new Scanner(System.in);

		System.out.print("What is your name?  ");

		name = scan.next();
		name = StringUtils.capitalize(name);
		{
			System.out.print("Hello " + name + ". I am thinking of an age between 0 and 100.  "
					+ "Of which age do you think that I am thinking?   ");
			age_Guess = scan.nextInt();
		}
		while (age_Guess != age) {
			if (0 > age_Guess || age_Guess > 100) {
				System.out.println(
						"Please read directions and try again!" + " I am thinking of an age between 0 and 100. "
								+ "Of which age do you think that I am thinking?   ");
				age_Guess = scan.nextInt();
			}

			if (age_Guess >= 0 && age_Guess <= 100) {
				if (age_Guess < age) {
					System.out.println("You guessed wrong! Guess an older age.");
					age_Guess = scan.nextInt();
				}

				else if (age_Guess > age) {
					System.out.println("You guessed wrong! Guess a younger age.");
					age_Guess = scan.nextInt();
				} else {
					System.out
							.println("Please read directions and try again! I am thinking of an age between 0 and 100. "
									+ "Of which age do you think that I am thinking?");
					age_Guess = scan.nextInt();
				}
			}
			if (age_Guess == age) {
				System.out.println("That's correct " + name + "!! I was thinking of " + age + "!!");
				System.exit(0);
			}

		}
	}
}
