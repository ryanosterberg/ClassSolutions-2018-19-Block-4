package randomNumbers;

import java.util.Random;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random randall = new Random();
		System.out.println("Lottery Time!!");
		System.out.println("What is the first number?(1-25)");
		int one = input.nextInt();
		System.out.println("What is the second number?(1-25)");
		int two = input.nextInt();
		System.out.println("What is the third number?(1-25)");
		int three = input.nextInt();
		System.out.println("What is the fourth number?(1-25)");
		int four = input.nextInt();
		int success = 0;
		int win = 0;
		int guess = 0;
		for (success = 0; success == 0; success = win) {
			int first = 1 + randall.nextInt(25 - 1 + 1);
			int second = 1 + randall.nextInt(25 - 1 + 1);
			int third = 1 + randall.nextInt(25 - 1 + 1);
			int fourth = 1 + randall.nextInt(25 - 1 + 1);
			guess++;
			if (one == first && two == second && three == third && four == fourth) {
				win = 1;
			}
		}
		System.out.println("Number of guesses: " + guess);
		input.close();
	}

}
