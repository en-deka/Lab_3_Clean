
//**************************************************************************************************************
//
//  ValueCounter.java		Author: Fischer
//
//  This program asks the user to enter a statement; it then counts and prints
//  how many of each lower case vowel (a, e, i, o, and u) are in the string, and
//  counts and prints the number of non-vowel characters in the string.
//**************************************************************************************************************
import java.util.Scanner;

public class ValueCounter {

	public static void main(String[] args) {
		// initialize vowels
		int count_a = 0, count_e = 0, count_i = 0, count_o = 0, count_u = 0;
		// initialize non vowel characters
		int count_non_vowel_chars = 0;
		char a = 'a', e = 'e', i = 'i', o = 'o', u = 'u';

		Scanner scan = new Scanner(System.in);

		// request user input
		System.out.print("Please enter your message.  ");
		String input = scan.nextLine();

		// uses "i" to iterate through all characters in string
		for (i = 0; i < input.length(); i++) {

			{
				// running count of vowels and non vowel characters
				if (input.charAt(i) == 'a')
					count_a++;

				else if (input.charAt(i) == ' ')
					count_non_vowel_chars++;
				else if (input.charAt(i) == 'e')
					count_e++;
				else if (input.charAt(i) == 'i')
					count_i++;
				else if (input.charAt(i) == 'o')
					count_o++;
				else if (input.charAt(i) == 'u')
					count_u++;
				else
					count_non_vowel_chars++;
				;

			}

		}
		// prints user message to verify correctness; prints sums
		System.out.print("Here is your message: " + input);
		// I had trouble here with formatting because of the multiple
		// double quotes so I made more than one print statement.
		System.out.print("\nThe number of lowercase vowels in your message is as follows: \n a:  " + count_a);
		System.out.print("\n e:  " + count_e + "\n i:  " + count_i + "\n o:  " + count_o + "\n u:  " + count_u);
		System.out.print("\nThe number of non-vowel characters in your message is " + count_non_vowel_chars + ".");
	}
}
