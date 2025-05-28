import java.util.Scanner;
class ReverseOfElement 
{
	public static int reverse(int n){
		int rev=0;
		while(n!=0){
			int ld=n%10;
			rev=rev*10+ld;
			n=n/10;
			}
			return rev;
			}
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("size of array");
		int size= scan.nextInt();
		
		int [] a= new int [size];
		System.out.println("Enter the element of array");
		for(int i=0;i<=a.length-1;i++){
			a[i]=scan.nextInt();
		}
		System.out.println(" reverse of the  element of the array :");
		
		for(int i=0;i<=a.length-1;i++){
			a[i]=reverse(a[i]);
		}
		
		System.out.print("[");
		for (int i=0;i<=a.length-1;i++ )
		{
		
		if(i==a.length-1){
			System.out.print(a[i]);
		}
		else{
			System.out.print(a[i]+ ", ");
		}
		}
		System.out.println("]");
		

	}
}
