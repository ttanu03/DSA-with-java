import java.util.Scanner;
class FrequencyOfElement 
{
	 public static void frequencyOfEachElement( int[] a)
	{
		 for( int i=0;i<=a.length-1;i++)
		{
			 boolean previousPresent=false;
			 for( int j=0;j<=i-1;j++)
			{
				 if(a[j]==a[i])
				{
					 previousPresent= true;
					 break;
				}
			}
			if(previousPresent==false)
			{
				int count=0;
			for( int j=0;j<=a.length-1;j++)
				{

				if(a[i]==a[j])
				{
					count++;
				}
			}
			
			
			System.out.println( a[i] + " is repeated "+ count +"times");
			}
			}
		
		}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size= sc.nextInt();
		int [] a= new int[size];
		System.out.println("enter  the aray element");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
	    frequencyOfEachElement( a);	
	}
}
