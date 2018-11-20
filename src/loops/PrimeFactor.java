package loops;
import java.util.Scanner;
public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int div = 0;
		int count = 0;
		int rem1 = 0;
		int rem2 = 0;
		int ind = 0;
		int ans = 0;
		int in = 0;
		
		System.out.println("what postive integer would you like the prime factorization of?");
		Scanner input = new Scanner(System.in);
		in = input.nextInt();
		div = in;
		for(num = 1; num <= 10000; num++) {
			
			for(count = 2; count <= in; count++) {
				rem1 = num % count;
				if(rem1 == 0) {
					ind++;
				}
			}
			if(ind == 1) {
				while((div % num) == 0) {
					div = div / num;
					System.out.print(num + "    ");
				}
			}
			ind = 0;
		}
	}

}
