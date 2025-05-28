import java.util.Scanner;
import java.util.Arrays;
class NthLargestNumber
{
	public static void largestNumber( int[]a, int n)
	{
		for(int i=0;i<=a.length-1;i++)
		{
			int count=0;
			for(int j=0;j<=a.length-1;j++)
			{
				if (a[j]>a[i])
				{
					count++;
				}
			}
			if(count==n-1)
			{System.out.println( a[i] + " : is the nth largest number");
			break;
			}
		}
	}
		

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int  size=sc.nextInt();
		int [] a=new int[size];
		
		System.out.println("Enter the element of array");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
			System.out.println("Enter the nth number for largest element");
			int n= sc.nextInt();
			largestNumber(a,n);



	}
}
