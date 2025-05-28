
import java util.Scanner;	
class  XylemAndPhloem{
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in); 
		System.out.println("Enter the number");
		int num=scan.nextInt();
		if(sumOfFDAndLD(num)== sumOfMD(num)){
			System.out,println("number is xylem");}
         else{
			 System.out.println("number is phloem");
	}
	}
	public static int sumOfFDAndLD(int num){
		int sum=0;
		int ld=num%10;
		while(num>9){
			num=num/10;
		}
		sum=ld+num;
		return sum;
	}
 public static int sumOfMD(int num){
	 int sum=0;
	 num=num/10;
	 while(num>9){
		 int ld=num%10;
		 sum=sum+ld;}
		 return sum;
	 }
}
}

         