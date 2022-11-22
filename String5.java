package src;

public class String5 {

	public static void main(String[] args) {
		int s2,Stringlength=0;
		String s= new String("Hello java world");
		String arr[]= s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
		s2=arr[i].length();
		//Stringlength=s2;
		Stringlength+=s2;
		
		}System.out.println(Stringlength);
		
	}

}
