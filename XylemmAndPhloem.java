
import java.util.Scanner;
class  XylemmAndPhloem
{
	public static void main(String[] args) 
	{
		int num=89766;
		int sum1=0;
		int sum2=0;
		int ld=num%10;
		sum1=sum1+ld;
		num=num/10;
		while(num>9){
			ld =num/10;
			sum2=sum2+ld;
			num=num/10;
		}
		sum1= sum1+num;
		if(sum1==sum2){
			System.out.println("number is xylem ");}
		else{
			System.out.println("number is pholem");

	}
}
}
