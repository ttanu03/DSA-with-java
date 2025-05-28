import java.util.Scanner;
class PrimeNumber

{
	public static int sumOfFactor( int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
		
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number ");
		int num= sc.nextInt();
		int factor=sumOfFactor(num);
		int sum=0;
		for(int i=1;i<=factor;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println("the given number is a perfect number ");
		}
		else{
			System.out.println("the given number is not a perfect number ");
		}
		thisis the number nghnknnngng01111111111111111111111111111011111




	}
}
