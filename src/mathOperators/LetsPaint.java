package mathOperators;

import java.util.Scanner;

public class LetsPaint {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double length = -999.0;
		double width = -999.0;
		double area = -999.0;
		double gallons = -999.0;
		System.out.println("What is the length of the room in feet?");
		length = input.nextDouble();
		System.out.println("What is the width of the room in feet?");
		width = input.nextDouble();
		area = (length * 8.0 * 2) + (width * 8.0 * 2);
		gallons = area / 150.0;
		System.out.println("\nDimensions of the room: " + length + " x " + width + " x 8.0");
		System.out.println("Area of walls: " + area + " square feet");
		System.out.println("Gallons of paint needed to paint the room: " + gallons + " gallons");
	}

}
