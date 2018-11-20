package loops;

import java.util.Scanner;

public class DivisorsInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int in = 0;
		int num = 0;
		int counter = 0;
		int divisors = 0;
		int mostDiv = 0;
		int big = 0;
		System.out.println("Enter the upper limit of the range in which to find the number with the biggest amount of divisors: ");
		in = input.nextInt();
		
		for (num = 1; num <= in; num++) {
			divisors = 0;
			for (counter = 1; counter <= num; counter++) {
				if (num % counter == 0) {
					divisors++;
					if (divisors > mostDiv) {
						mostDiv = divisors;
						big = num;
					}
				}
			}
		}
		System.out.println("Number with the most divisors between 1 and " + in + ": " + big);
	}

}
