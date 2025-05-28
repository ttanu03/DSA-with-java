class Pattern10 
{
	public static void main(String[] args) 
	{

		for(int i=1;i<=5;i++){
					int num1=1;
					int num2=2;
			for(int j=1;j<=5;j++){
				 if(i%2==0 ){
					 System.out.print ( num2+"\t" );
					 num2=num2+2;}
					 else{
						 System.out.print( num1 +"\t");
						 num1=num1+2;}}
						 System.out.println( );
				 }

	}
}
