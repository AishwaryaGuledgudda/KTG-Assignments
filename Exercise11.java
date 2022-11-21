package src;

import java.util.Arrays;

public class Exercise11 
{

	public static void main(String[] args) 
	{
		int a[]= {8,0,2,3};
		SelectionSort(a);
		System.out.println(Arrays.toString(a));
		
	}
static void SelectionSort(int a[]) 
	{
		int i=0,n= a.length,temp,j;
		for(i=0;i<n-1;i++) 
		{
		int min=i;
		for(j=i+1;j<n-1;j++) 
		{
			if(a[j]<a[min]) 
				min=j;
			{
				temp=a[min];
				a[min]=a[i];
				a[i]=temp;
			}
		}
			
			
		}
	}
}