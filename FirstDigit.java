import java.util.Scanner;
class FirstDigit
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int count=0;
		while(num>9)
		{
		  num=num/10;
		}
		for(int i=1;i<=num;i++)
		{ if(num%i==0){
			count++;
		}
		}
		if(count==2){

		System.out.println("The first digit of a number is a prime");
		}
		else{
			System.out.println("not");
		}
		
	}
}
