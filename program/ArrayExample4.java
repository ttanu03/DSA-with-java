
import java.util.Scanner;
class ArrayExample4 
{
	public static int sumOfElement(int[] a)
		{
		int sum=0;
		for(int i=0;i<a.length;i++)
			{
		    sum=sum+a[i];
			}
		     return sum;
		}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size= scan.nextInt();
		int [] a=new int[size];
		System.out.println("Enter the elementof array");
		for( int i=0;i<=a.length-1;i++){
			a[i]=scan.nextInt();
			}System.out.println( "sum of the element is"+  sumOfElement(a));



		
	}
}
