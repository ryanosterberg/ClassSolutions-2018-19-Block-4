package randomNumbers;

import java.util.Random;
import java.util.Scanner;

public class RollADie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random number = new Random();
		Scanner input = new Scanner(System.in);
		int high = 6;
		int low = 1;
		int counter = 0;
		int randNumber = 0;
		double one = 0;
		double two = 0;
		double three = 0;
		double four = 0;
		double five = 0;
		double six = 0;
		int rolls = 0;
		int total = 0;
		System.out.println("How many times did you roll the die?");
		rolls = input.nextInt();
		for (counter = 1; counter <= rolls; counter++) {
			randNumber = low + number.nextInt(high - low + 1);
			if (randNumber == 1) {
				one++;
			}
			if (randNumber == 2) {
				two++;
			}
			if (randNumber == 3) {
				three++;
			}
			if (randNumber == 4) {
				four++;
			}
			if (randNumber == 5) {
				five++;
			}
			if (randNumber == 6) {
				six++;
			}
			total++;
		}
		System.out.println("Ones: " + one + " Two: " + two + " Three: " + three + " Four: " + four + " Five: " + five
				+ " Six: " + six);
		System.out.println("Percentages: Ones: " + one / total * 100 + " Two: " + two / total * 100 + " Three: "
				+ three / total + " Four: " + four / total * 100 + " Five: " + five / total * 100 + " Six: "
				+ six / total * 100);
	}
}
