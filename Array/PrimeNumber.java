import java.util.Scanner;
class PrimeNumber
{
	public static int countOfFactors( int num)
		{
		int count=0;
		for(int i=1;i<=num;i++)
			{
			if(num%i==0)
				{
				count++;
				}
			}
			return count;
		}


	public static void main(String[] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the  number :");
		int num=sc.nextInt();
	     int count=countOfFactors(num);
		 System.out.println("The count of factors of a given  number is " + count);
		if (count==2)
		{
			System.out.println("given number is a  prime number ");
		}
		else{
			System.out.println("the number is not a prime number ");
			}
	}
}