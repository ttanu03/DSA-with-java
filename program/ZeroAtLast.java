import java.util.Scanner;
import java.util.Arrays;
class ZeroAtLast 
{
	public static int[] zeroAtLastArray(int []a, int size)
	{
        int [] b=new int[size];
		int index=0;
		for(int i=0;i<=a.length-1;i++)
		{
				if(a[i]!=0){
					b[index]=a[i]; 
					index++;
			   }
		}
		
	
		return b;
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
		System.out.println("The   new  array are:");
		System.out.println(Arrays.toString(zeroAtLastArray(a,size)));

		
	}
}
