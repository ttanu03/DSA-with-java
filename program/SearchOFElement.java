import java.util.Scanner;
class SearchOfElement 
{
	public static int search( int[]a, int target)
		{
		 int index=-1;
		for(int i=0;i<=a.length-1;i++)
			{
			if(a[i]==target){
				index=i;
				break;}
			}
			return index;
		}

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);

		System.out.println("enter the size of array");
		int size=scan.nextInt();
		int a[]=new int[size];
		System.out.println("enter the element of array");
		for(int i=0;i<=a.length-1;i++){
			a[i]=scan.nextInt();}
		System.out.println("enter the target element");
		int target=scan.nextInt();
	System.out.println("the index of target element is: "+ search(a,target));

	
	}
}
