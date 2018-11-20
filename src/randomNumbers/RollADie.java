package randomNumbers;
import java.util.Random;
import java.util.Scanner;
public class RollADie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator = new Random();
Scanner input = new Scanner(System.in);
System.out.println("How many sides are on the die?");
int max = input.nextInt();
int min = 1;
System.out.println("How many times do you want to roll the die?");
int times = input.nextInt();

System.out.println("Rolls:");
for (int rolls = 1; rolls <= times; rolls++)
{
int randomNumber = min + generator.nextInt(max-min+1);
System.out.print(randomNumber + " ");

}

input.close();}
}