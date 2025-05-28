class Pattern28 
{
	public static void main(String[] args) 
	{
	
		int spaceCount=8;
		int starCount=1;
		for(int i=1;i<=9;i++){
		for(int a=1;a<=starCount;a++){
                  System.out.print("*");
				}
			
			   for(int b=1;b<=spaceCount;b++){
				   
						System.out.print(" ");
						} 
			for(int c=1;c<=starCount;c++){
                  System.out.print("*");
				}
				if(i<5){
						starCount++;
						spaceCount-=2;
				}
				else{
					starCount--;
					spaceCount+=2;}
		
		System.out.println();
		}
		
	}
}
