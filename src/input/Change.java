package input;
import java.util.Scanner;
import java.lang.Math;
public class Change {
	
	public static void main(String[] args) {
		int change=2;
		int quarters=3;
		int dimes=0;
		int nickels=2;
		int pennies=1;
		int dollar=2;
		Scanner spherei=new Scanner(System.in);
		System.out.println("How much change is there in cents?");
		change= spherei.nextInt();
		dollar=(change/100);
		change=(change%100);
		quarters=((change/25));
		change=(change%25);
		dimes=((change/10));
		change=(change%10);
		nickels=((change/5));
		change=(change%5);
		pennies=((change/1));
		System.out.println("Your change is "+dollar+" dollars, " +quarters+" quarters, "+dimes+ " dimes, "+ nickels+" nickels,and "+pennies+" pennies!");

	}

}
