package src;

import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the world of Java");
		Welcome W = new Welcome();
		System.out.println("The Sum of two numbers are " +W.sum());

	}
 public int sum() {
	 System.out.println("Enetr the two numbers");
	 Scanner S = new Scanner(System.in) ;
	 int a = S.nextInt();
	 int b = S.nextInt();
	 int c = a+b;
	 return c;
 }
}
