package Strings;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
		
		boolean comparison = false;
			System.out.println("Enter password: ");
			String password = input.nextLine();
			
			System.out.println("Verify password: ");
			String verify = input.nextLine();
		
			while(comparison == false){
				if(password.contentEquals(verify)){
				comparison = true;	
				System.out.println("Passwords match.");
				} else {
					System.out.println("Verify password: ");
					verify = input.nextLine();
				}
			}
	}

}
