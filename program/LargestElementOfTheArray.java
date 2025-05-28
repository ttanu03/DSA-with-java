
import java.util.Scanner;
class  LargestElementOfTheArray 
{
	public static int largestElement(int[]a){
		int max=a[0];
		for(int i=0;i<=a.length-1;i++){
		if(a[i]>max)
			{
		     max=a[i];
			}
	}return max;}

	public static void main(String[] args) 
	{
		Scanner  sc=new Scanner (System.in);
		System.out.println("Ente array size");
		int size= sc.nextInt();
		int[] a= new int[size];
		System.out.println("enter the element of the array");
		for(int i=0;i<=a.length-1;i++){
		a[i]=sc.nextInt();
		}
		System.out.println(" the max element are:"  + largestElement(a));

}
}
