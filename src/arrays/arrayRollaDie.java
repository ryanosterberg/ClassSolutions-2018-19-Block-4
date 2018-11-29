package arrays;

import java.util.Random;
import java.util.Scanner;

public class arrayRollaDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Random die = new Random();
		int min = 1;
		int max = 6;
		int[] rolls = new int[10001];
		for (int j=1; j<10001; j++)
		{
			rolls[j] = min + die.nextInt (max - min + 1);
		}
		
		System.out.println("Give a roll number (99999 to quit)");
		int roll = input.nextInt();
		if (roll<=10000)
		{
		System.out.println("the result of roll " + roll + " was " + rolls[roll]);
		}
		
		
		input.close();
	}

}
