ximport java.util.Scanner;
class BounceNumber

{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the number");
		int num= scan.nextInt();
		if (num==ascending(num)){
			System.out.println("Givem number is not a bounce number");}
		else{
			if(num==descending( num)){
				System.out.println("not a bounce number");}
			 else{
				 System.out.println( "a bounce number");

		}
		}
	}
	
	public static  int ascending(int num){
		int rev=0;
		int temp=num;
	
		for( int i=1;i<=9;i++)
		{
			num=temp;
			while(num!=0){
				int ld=num%10;
				if(ld==i){
					rev=rev*10+ld;
				}
				num=num/10;
				}
	
		}
		return rev;
	
	}
		public static int descending(int num){
		int rev=0;
		int temp=num;
		for( int i=9;i<=0;i--)
		{
			num=temp;
			while(num!=0){
				int ld=num%10;
				if(ld==i){
					rev=rev*10+ld;
				}
				num=num/10;}
				
		}
		return rev;
				
		}
}






