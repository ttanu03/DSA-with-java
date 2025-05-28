import java.util.Scanner;
import java.util.Arrays;
class LeftRotation
  
{
	public static int[] leftRotation(int  n,int[] a)
	{
		for(int x=1;x<=n;x++)
		{
         int temp=a[0];
		 for(int i=0 ;i<a.length-1;i++)
			{
			 a[i]=a[i+1];
		}
		a[a.length-1]=temp;
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
		System.out.println("Enter the number of left rotation");
		int n=sc.nextInt();
		System.out.println("The  left rotated array are:");
		System.out.println(Arrays.toString(leftRotation(n,a)));

	}
}
