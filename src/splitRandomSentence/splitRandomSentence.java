package splitRandomSentence;

import java.util.Random;
import java.util.Scanner;

public class splitRandomSentence {

	public static void main(String[] args) {
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("Sentence:");
		
		String sentence = input.nextLine();
		String[] words = sentence.split(" ");
		int max = words.length;
		int min = 0;
		int randomWord;
		randomWord = generator.nextInt(max - min + 1);
		System.out.println(words[randomWord]);

	}

}
