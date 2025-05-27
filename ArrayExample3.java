import java.util.Scanner;
import java.util.Arrays;
class ArrayExample3
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
		 System.out.println("Array elements are:"+Arrays.toString(a));
		// System.out.print("[");
		 //for(int i=0;i<=a.length-1;i++){
			/* if(i==a.length-1){
				  System.out.print(a[i]);

			 }
			 else{
				  System.out.print(a[i]+ ", ");
				  }
		 }
		 System.out.println("]");*/
}
}
