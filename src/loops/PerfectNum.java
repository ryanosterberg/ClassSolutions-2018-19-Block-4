package loops;

public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = 0;
		int count = 0;
		int rem = 0;
		for(num = 1; num <= 1000; num++) {
			for(count = 1; count < num; count++) {
				if((num % count) == 0) {
					sum = sum + count;
				}
			}
			if(sum == num) {
				System.out.println(num);
			}
			sum = 0;
		}
	}

}
