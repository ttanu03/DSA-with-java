class PerfectNumber1to1000
{
	
	public static void main(String[] args) 
	{
		
		for(int i=1;i<=1000;i++)
		{   int sum=0;
			int num=i;
			for(int j=1;j<num;j++)
			{
				if(num%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==num)
			{
				System.out.println(num);
			}
		}
			
		}

}
