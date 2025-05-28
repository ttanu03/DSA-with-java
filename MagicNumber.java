class MagicNumber 
{
	public static void main(String[] args) 
	{int num=7129;
	int sum=0;
	while(num>9)
		{while (num!=0)
		{
		int ld=num%10;
		sum=sum+ld;
		num=num/10;
		}
		num=sum;
		sum=0;}
		if (num==1)
		{
			System.out.println("Number is a magic number");
		}
		else{
			System.out.println(" not magic number");
		}
		
	}
}
