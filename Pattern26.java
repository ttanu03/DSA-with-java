import java.util.Scanner;
class Pattern26
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int row= scan.nextInt();
		int spaceCount=row-1;
		int starCount=1;
		int star=1;
		for(int i=1;i<=row;i++){
			
				for(int a=1;a<=spaceCount;a++){
                  System.out.print(" ");
				}
			
			   for(int b=1;b<=starCount;b++){
				   
						System.out.print("*");
						star++;
						}
						if(i<row){
						starCount++;
						spaceCount--;}
						else{
						starCount--;
						spaceCount++;}
	
		
		System.out.println();
		}
		
	}
}
