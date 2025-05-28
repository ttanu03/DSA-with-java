import java.util.Scanner;
class SumOfFactorPrime  
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		int sum=0;
		int count=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
		
			}
		}
		 for (int i=1;i<=sum;i++)
		 {
			 if(sum%i==0)
			 {
				 count++;
			 }
		 }
		 if(count==2)
		{
			 System.out.println(" THe sum of factor is prime number");
		}
		else{
			System.out.println("not prime");
		}


	}
}
