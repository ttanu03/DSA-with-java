import java.util.Scanner;
import java.util.Arrays;

class Removeduplicationfromarray 
{
	public static int[] removeDuplication( int[] a){
		int count=0;
		boolean previousPresent=false;
		for( int i=0;i<=a.length-1;i++)
		{
			
			for(int j=0;j<=a.length-1;j++)
			{
				if(a[j]==a[i])
				{
					previousPresent=true;
					break;
				}
				 if(previousPresent=false)
				{
					 count++;
				}
			}
		}
				int b[]=new int[count];
				int index=0;
				for( int i=0;i<=a.length-1;i++)
		{
			
			for(int j=0;j<=a.length-1;j++)
			{
				if(a[j]==a[i])
				{
					previousPresent=true;
					break;
				}
				 if(previousPresent=false)
				{
					 b[index]=a[i];
					 index++;
				}
			}
		}
				return b;
			}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println( "the size of arrau");
		int size= sc.nextInt();
		int a[]= new int[size];
		System.out.println( "the size of arrau");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
			System.out.println("The array without duplication element :"  );
			System.out.println(Arrays.toString(removeDuplication((a)));

	}
}
