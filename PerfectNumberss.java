class PerfectNumberss
{
	public static void main(String[] args) 
	{
	
		for (int i=1;i<=100;i++ )
		{
		int num= i;
		int sum= 0;
		
	    for(int a=1;a<=num;a++)
			{
				if(num%a==0){
					sum=sum+a;
				}
		}


		if(sum==num){
			System.out.println(num);
		}
		
	}
}
