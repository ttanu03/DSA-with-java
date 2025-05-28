  import java.util.Scanner;
  import java.util.Arrays;
  class InsertIndex
{
	public static int[] insertAtIndex(int[]a,num,index)
		{
		for(int i=0;i<=a.length-1;i++)
			{
			if(i<index)
				{
				b[i]=a[i];
					}
				if(i==index){
					b[index]=num;
				}
				else{
					b[i]=a[i-1];
						}
			}
			return b;
		}


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the size");
		int size=sc.nextInt();
		int []a=new int[size];
		System.out.println("enter the element of array");
		for(int i=0;i<=a.length-1;i++){
			a[i]=sc.nextInt();
		}
			System.out.println("enter the element which will be added");
			int num=sc.nextInt();
			System.out.println("enter the index at which the element  which will be added");
			int index=
			System.out.println("The  new array are:");
		System.out.println(Arrays.toString(insertAtIndex(a, num, index)));
		
	}
}
