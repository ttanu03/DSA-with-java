import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the number");
		int num =sc.nextInt();
		int sum=0;
		int mul=1;
		while(num>0)
		{
			int ld=num%10;
			sum=sum+ld;
			mul=mul*ld;
			num=num/10;
			}
			if(sum==mul)
		{
				System.out.println(" The number is a spy number ");
		}
		else{
			System.out.println("The number is not a spy number ");
			 }

			


		
		}
}
