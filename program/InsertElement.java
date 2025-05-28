import java.util.Scanner;
import java.util.Arrays;

class InsertElement
{
	public static int[] insertElemnt(int  []a, int num)
	{
		int []b= new int[a.length+1];
		for(int i=0;i<=a.length-1;i++)
		{
			
			b[i]=a[i];
		}
		b[b.length-1]=num;
		return b;
	}
		
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("size of array");
		int size=sc.nextInt();
		int []a=new int[size];
		//int [] b=new int[size+1];
		System.out.println("enter the element of array");
		for(int i=0;i<=a.length-1;i++){
			a[i]=sc.nextInt();
		}
			System.out.println("enter the element which will be added");
			int num=sc.nextInt();
			System.out.println("The  new array are:");
		System.out.println(Arrays.toString(insertElemnt(a,num)));


	}
}
