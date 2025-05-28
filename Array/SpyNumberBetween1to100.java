import java.util.Scanner;
class SpyNumberBetween1to100 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=100;i++)
		{
			int num=i;
		while(num>0)
		{
		int sum=0;
		   int mul=1;
			int ld=num%10;
			sum=sum+ld;
			mul=mul*ld;
			num=num/10;
			
			if(sum==mul)
		{
				System.out.println(num);
		}
		}
		}
		}
}
