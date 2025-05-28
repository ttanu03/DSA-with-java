import java.util.Scanner;
class SumOfDigitOfEachElement 
{
	public static int sumOfDigit(int n){
		int sum=0;
		while(n!=0){
			int ld=n%10;
			sum=sum+ld;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("size of array");
		int size=sc.nextInt();
		int []a=new int[size];
		System.out.println("enter the element of array");
		for(int i=0;i<=a.length-1;i++){
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<=a.length-1;i++){ 	
			sum=sum+sumOfDigit(a[i]);
		}
		System.out.println( "sum of edigit of element :"+ sum);

	}
}
