package oop;

public class WorkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Worker bob = new Worker ();
System.out.println("number of hours worked: " + bob.getHours());
bob.setHours(6);
System.out.println("number of hours worked: " + bob.getHours());
System.out.println("hourly rate of pay: " + bob.getrate());
bob.setrate(8.50);
System.out.println("hourly rate of pay: " + bob.getrate());
bob.payCheck();
System.out.println("pay check : " + bob.payCheck());
System.out.println("raise: " + bob.raise());

	}
}
