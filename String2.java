package src;

import java.util.Locale;

public class String2 {

	public static void main(String[] args) {
		int i;
		 String s= new String("java standard edition");
		 String arr[]= s.split(" ");
		 for(i=0;i<arr.length;i++) {
			
			 String s1= arr[i].substring(0, 1).toUpperCase();
			 String s2=arr[i].substring(1);
			 String fullstring = s1+s2;
			 System.out.print(fullstring+ " ");
			 
		 }
		
		
		
	}
	}