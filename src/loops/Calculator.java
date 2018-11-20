package loops;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int choice = 0;
		int quit = 0;
		while (quit == 0) {
			System.out.println("1 - is it a right triangle?");
			System.out.println("2 - powers");
			System.out.println("3 - square root");
			System.out.println("4 - round up");
			System.out.println("5 - round down");
			System.out.println("6 - quit");
			System.out.println("Please input a number:");
			choice = input.nextInt();
			while (choice < 1 || choice > 6) {
				System.out.println("Not a valid number.");
				System.out.println("Please input a number:");
				choice = input.nextInt();
			}
			if (choice == 1) {
				int num1 = 0;
				int num2 = 0;
				int num3 = 0;
				System.out.println("Please enter side 1: ");
				num1 = input.nextInt();
				System.out.println("Please enter side 2: ");
				num2 = input.nextInt();
				System.out.println("Please enter the hypotnuse: ");
				num3 = input.nextInt();
				while (num1 <= 0 || num2 <= 0 || num3 <= 0) {
					System.out.println("These are not valid numbers");
					System.out.println("Please input new numbers:");
					System.out.println("Please enter side 1: ");
					num1 = input.nextInt();
					System.out.println("Please enter side 2: ");
					num2 = input.nextInt();
					System.out.println("Please enter the hypotnuse: ");
					num3 = input.nextInt();
				}
				if (num1 * num1 + num2 * num2 == num3 * num3) {
					System.out.println("This is a right triangle");
				} else {
					System.out.println("This is not a right triangle");
				}
			}
			if (choice == 2) {
				double num1 = 0.0;
				double num2 = 0.0;
				System.out.println("Please input a base:");
				num1 = input.nextDouble();
				System.out.println("Please input a power:");
				num2 = input.nextDouble();
				double power = Math.pow(num1, num2);
				System.out.println("The power is: " + power);
			}
			if (choice == 3) {
				double num1 = 0.0;
				System.out.println("What number should we take the square root of?");
				num1 = input.nextDouble();
				while (num1 < 0) {
					System.out.println("Number is not valid");
					System.out.println("Please input a new number:");
					num1 = input.nextDouble();
				}
				double square = Math.sqrt(num1);
				System.out.println("The square root is " + square);
			}
			if (choice == 4) {
				double num1 = 0.0;
				System.out.println("What number should we round up?");
				num1 = input.nextDouble();
				double round = Math.ceil(num1);
				System.out.println("The number rounded is: " + round);
			}
			if (choice == 5) {
				double num1 = 0.0;
				System.out.println("What number should we round down?");
				num1 = input.nextDouble();
				double round = Math.floor(num1);
				System.out.println("The number rounded is: " + round);
			}
			if (choice == 6) {
				quit = 1;
			}
		}
	}
}
