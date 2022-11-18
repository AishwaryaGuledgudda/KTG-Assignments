package src;

import java.util.Scanner;

public class Welcome {
	 Scanner S = new Scanner(System.in) ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the world of Java");
		Welcome W = new Welcome();
		System.out.println("The Sum of two numbers are " +W.sum());
		W.Swap();

	}
 public int sum() {
	 System.out.println("Enter the two numbers");
	 Scanner S = new Scanner(System.in) ;
	 int a = S.nextInt();
	 int b = S.nextInt();
	 int c = a+b;
	 return c;
 }
 
 public void Swap()
 {
	System.out.println("Enter the nmbers to be swapped");
	int A = S.nextInt();
	int B = S.nextInt();
	A = A+B; 
	B = A-B; 
	A = A-B; 
	System.out.println("Values after swapping are" +A +B);
}
}
