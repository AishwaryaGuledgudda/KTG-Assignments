package src;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYear L = new LeapYear();
		L.LeapYear();

	}
public void LeapYear() {
	System.out.println("Enter a year:");
	Scanner S = new Scanner(System.in);
	long year = S.nextLong();
	if(year%400==0) {
		System.out.println("The year is leap year");
	}
	else if(year%100==0) {
		System.out.println("The year is not a leap year");
	}
	else if(year%4==0) {
		System.out.println("The year is leap year");
	}
	else {
		System.out.println("The year is not leap year");
	}
}
}
