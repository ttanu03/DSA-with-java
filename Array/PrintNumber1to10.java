import java.util.Scanner;
class PrintDigitOfNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the number");
		int num= sc.nextInt();
		while(num!=0)
		{
			int ld=num%10;
			System.out.println(ld);
			num=num/10;
		}
	}

}
