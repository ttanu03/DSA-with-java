class NeonNumber
{
	public static void main(String[] args) 
	{
		int num=4;
		int square=num*num;
		//logic of digit summation
		int temp=num;
		int sum=0;
		while(square!=0){
			
		int ld=square%10;
		sum=sum+ld;
		square=square/10;}
		
	   if(sum==num){
		   System.out.println("Number is a  neon number");}
       else{
		   System.out.println("not neon  number");
	   }
	   
	   }
}
