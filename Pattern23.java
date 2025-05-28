class Pattern23 
{
	public static void main(String[] args) 
	{
		int spaceCount=4;
		int starCount=1;
		for(int i=1;i<=5;i++){
			for(int a=1;a<=spaceCount;a++){
				System.out.print(" ");
			}
			for(int b=1;b<=starCount;b++){
				System.out.print("*");
			}
			spaceCount--;
			starCount+=2;
			System.out.println();}
	
	}
}
