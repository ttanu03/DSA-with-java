class PrimeMethod2 
{
	public static void main(String[] args) 
	{
		boolean res=prime(11);
		
		 System.out.println(res);
		
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

	