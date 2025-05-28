import java.util.Scanner;
class LearningArray  
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int a []=new int[10];
		//input the array
		System.out.println("Enter the element of the array");
        for(int i=0;i<10;i++)
		{
		a[i]= input.nextInt();
		}
//double up
		for(int i=0;i<10;i++)
		{
			a[i]= 2*a[i];
		}
	
	}
}
