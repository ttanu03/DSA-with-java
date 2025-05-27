import java .util.Scanner;
class FirstDigitPerfect 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sum=0;
		while(num>9)
		{
			num=num/10;
			}
			for(int i=1;i<num;i++)
		{ 
			if(num%i==0)
			{
				sum=sum+i;
				}
		}
				if(sum==num)
			{
					System.out.println("The first digit   is perfect number");
			}
			else{
				System.out.println(" the first digit is not perfect number");
			}

	}
}
