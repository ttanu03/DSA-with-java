import java.util.Scanner;
class  Multiplication 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		System.out.println("Enter the range");
		int range=scan.nextInt();
		table(num,range);

	}
	public static void table( int num,int range){
		for(int i=1;i<=range;i++){
			System.out.println(num +"*"+ i+"="+(num*i));
		}
	}
}
