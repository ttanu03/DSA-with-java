class Prime
{

	public static void main(String[] args) 
	{
		
		 System.out.println(prime(8));
		
	}
	public static  boolean prime( int num){
		int count=0;
		for (int i=1;i<=num;i++){
			if(num%i==0){
				count++;
				}}
		if (count==2)
		{
			return true;
					
				}
		else{
			return false;
			
		}
	}
		
}

		

