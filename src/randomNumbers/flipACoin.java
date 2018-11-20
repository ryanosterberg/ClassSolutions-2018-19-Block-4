package randomNumbers;
import java.util.Random;
public class flipACoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random aafreen = new Random();
		int counter1 = 0; 
		int counter2 = 0; 
		int min = 1; 
		int max = 2; 
		int randomNum = 0; 
		int heads = 0; 
		int tails = 0; 
		double largest = 0; 
		double smallest = 100000; 
		for (counter1 =1; counter1 <=1000000; counter1++) 
		{ 
			for (counter2 =1; counter2 <=100000; counter2++) 
			{ 
				randomNum = min + aafreen.nextInt(max-min+1); 
				if (randomNum == 1) 
				{ 
					heads++; 
				} 
				 
			} 
			if (heads>= largest) 
			{ 
				largest = heads; 
			 
 
			} 
			 
			if (heads<= smallest) 
			{ 
				smallest = heads; 
			} 
			heads = 0; 
		} 
		System.out.println("Maximum percentage: " + ((largest * 100)/100000) + "%"); 
		System.out.println("Minimum percentage: " + ((smallest * 100)/100000) + "%"); 
	}

}
