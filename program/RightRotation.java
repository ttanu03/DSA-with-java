import java.util.Scanner;
import java.util.Arrays;
class RightRotation 
{
	public static int[] rightRotation(  int n,int[] a)
	{
		for( int x=1;x<=n;x++)
		{
		int temp=a[a.length-1];
		for(int i=a.length-1 ;i>0;i--)
			{
			 a[i]=a[i-1];
		}
		a[0]=temp;
		}
		

		return a;
	}

		

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int [] a=new int[size];
		System.out.println("Enter the element");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number of right rotation");
		int n=sc.nextInt();
		System.out.println("The  right  rotated array are:");
		System.out.println(Arrays.toString(rightRotation( n,a)));

		
	}
}
