package oop;

public class Worker {
private int hourswork;
private double rate;
public Worker () {
	hourswork=0;
	rate=0.0;
}
public int getHours() {
	return hourswork;
}
public double getrate() {
	return rate;
}
public void setHours(int newHours) {
	hourswork=newHours;
}
public void setrate(double newrate) {
	rate = newrate;
}
public double payCheck () {
	return hourswork*rate;
}
public double raise() {
	return rate = rate+.50;
}
}
