class NeonNumber
{
	public static void main(String[] args) 
	{
		int num=6;
		int square=num*num;
		int temp=num;
		int sum=0;
		while(square!=0){
			
		int ld=square%10;
		sum=sum+ld;
		square=square/10;}
		
	   if(temp%sum==0){
		   System.out.println("Number is a  neon number");}
       else{
		   System.out.println("not neon  number");
	   }
	   
	   }
}
