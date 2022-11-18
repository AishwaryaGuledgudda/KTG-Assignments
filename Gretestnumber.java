package src;

import java.util.Scanner;

public class Gretestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int First= scan.nextInt();
		System.out.println("Enter the Second number :");
		int Sec= scan.nextInt();
		System.out.println("Enetr the third number");
		int Thir= scan.nextInt();
		if((First>Sec)&& (First>Thir))
				{
					System.out.println("First is greatest: " +First);
				}
		else if ((Sec>First)&&(Sec>Thir))
		{
			System.out.println("Second is greatest: " +Sec);
		
		}
		else
		{
			System.out.println("Third is greatest: " +Thir);
		}
	
	}
	
	
		
	

}
