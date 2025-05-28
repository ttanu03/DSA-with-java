import java.util.Scanner;
class MagicNumberByUsingMethods
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		int num=scan.nextInt();
		
		if (magic(num)==1)
		{
			System.out.println("number is a magic number");
		}else{
			System.out.println("number is not a magic number");
			}
	}
	public static void magic(int num){
		int sum=0;
		while(num>9){
		while(n!=0 ){
			int ld=num/10;
			sum=sum+ld;
			num=num/10;
			}
			num=sum;
			sum=0;}
			return num;

}
