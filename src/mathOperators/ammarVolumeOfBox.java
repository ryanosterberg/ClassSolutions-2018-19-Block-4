package mathOperators;

import java.util.Scanner;
public class ammarVolumeOfBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int side1 = 0;
		int side2 = 0;
		int side3 = 0;
		int volume = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Length of the first side?");
		side1= input.nextInt();
		System.out.println("Length of the second side?");
		side2= input.nextInt();
		System.out.println("Length of the third side?");
		side3= input.nextInt();
		volume= side1 * side2 * side3;
		System.out.println("The volume is " + volume);
	}

}
