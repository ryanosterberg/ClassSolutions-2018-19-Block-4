package Strings;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Write a sentence.(9999 to quit)");
		String sentence = input.nextLine();
		int counter = 0;
		int word = 1;
		int cont = 0;
		int yes = 0;
		for (cont = 0; cont == 0; cont = yes) {
			if (sentence.equals("9999") == false) {
				for (counter = 0; counter < sentence.length(); counter++) {
					if (sentence.charAt(counter) == ' ') {
						System.out.println();
						word++;
					} else {
						System.out.print(sentence.charAt(counter));
					}
				}
				System.out.println();
				System.out.println("Number of words: " + word);
				word = 1;
				System.out.println("Write a sentence.(9999 to quit)");
				sentence = input.nextLine();
			} else {
				yes = 1;
			}
		}
		input.close();
	}

}
