import java.util.Scanner;

public class PigLatinTranslator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String ans = "y";
		String translation = null;

		System.out.println("Welcome to the Pig Latin Translator!");
		System.out.println();

		while (ans.equalsIgnoreCase("y")) {

			System.out.println("Please enter a word to be translated: ");
			String userLine = scan.nextLine();
			userLine = userLine.toLowerCase();
			
			char firstLetter = userLine.charAt(0);

			//using an if-else statement to test for whether or not the user-entered word
			//starts with a consonant or a vowel
			if (firstLetter == 'a' || firstLetter == 'A' || firstLetter == 'e' || firstLetter == 'E' || firstLetter == 'i' || firstLetter == 'I'
					|| firstLetter == 'o' || firstLetter == 'O' || firstLetter == 'u' || firstLetter == 'U') {
				translation = userLine + "way";
			} else {
				translation = userLine.substring(1) + userLine.charAt(0) + "ay";
			}

			System.out.println(userLine + " in Pig Latin is " +translation);

			System.out.println("Translate another word? (y/n): ");
			ans = scan.next();
		}

		System.out.println("Ankthay ouyay eryvay uchmay!");
		scan.close();
	}
}
