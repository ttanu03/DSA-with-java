
class  Pattern27
{
	public static void main(String[] args) 
	{
		
		//Scanner scan=new Scanner(System.in);
		//int row= scan.nextInt();
		int spaceCount=4;
		int starCount=1;
		for(int i=1;i<=9;i++){
		for(int a=1;a<=spaceCount;a++){
                  System.out.print(" ");
				}
			
			   for(int b=1;b<=starCount;b++){
				   
						System.out.print("*");
						}  
						if(i<5){
						starCount+=2;
						spaceCount--;}
						else{
							spaceCount++;
						starCount-=2;}
	
		
		                System.out.println();
		}
		

	
	}
}
