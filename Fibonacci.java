package src;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci F = new Fibonacci();
		F.Series();
	}
	public void Series() {
		
		int n1=0,n2=1, temp=0,i,limit=250;
	
		while(temp<=200)
		{
			temp=n1+n2;
			System.out.println(" "+temp);
			 n1=n2;
			 n2=temp;
			 
		}
		
	}
	
}
