package Strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        String reverse = "";
        String str2 = "done";
        System.out.println("Enter a word");
        String word = input.nextLine();
        int length = word.length();
        do {
            for (int i = length - 1; i >= 0; i--) {
                reverse = reverse + word.charAt(i);
            }
            if (word.equals(reverse)) {
                System.out.println("The string is a palindrome.");

            } else {
                System.out.println("The string isn't a palindrome.");
            }
            System.out.println("Enter a word or done to quit");
            word = input.nextLine();
            length = word.length();
            reverse = "";
        } while (!(word.equals(str2)));

        input.close();
	}

}
