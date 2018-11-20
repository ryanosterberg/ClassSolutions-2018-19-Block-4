package Strings;
import java.util.Scanner;
public class xiongStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Write a sentence:");
String sentence = input.nextLine();
int character = sentence.length();
int counter= 0;
for(counter = 0; counter < character; counter++){
	System.out.println(sentence.charAt(counter));
	}

}
}
