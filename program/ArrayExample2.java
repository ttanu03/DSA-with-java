import java.util.Scanner;
class ArrayExample2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int[] a=new int[size];

		System.out.println("Enter the element of array");
		 for(int i=0;i<=a.length-1;i++){
			  a[i]=sc.nextInt();
			 
		 }
		 System.out.println("Array elements are:");
		 for(int i=0;i<=a.length-1;i++){
			 System.out.println(a[i]);}
		 }
}
