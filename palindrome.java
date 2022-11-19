package src;

import java.util.Scanner;

public class palindrome {
	Scanner S = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindrome P = new palindrome();
		int Reverse = P.IsPalindrome();
		System.out.println("The reversed number is " +Reverse);
		
	}
	public int IsPalindrome() {
		int rev=0;
		System.out.println("Enter a number");
		int n = S.nextInt();
		int temp = n;
		while(n>0) {
			rev=(rev*10)+(n%10);
			n=(n/10);
		}
		if(temp==rev) 
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not a palindrome");
		}
		return rev;
	}
	
	 
 }

