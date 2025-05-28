class  PrimeDigit
{
 
	public static void main(String[] args) 
	{
		int num=78901;
		int count=0;
		while(num!=0){
		int ld=num%10;
		for(int i=1;i<=num;i++){
			if(num%i==0)
			{
				count++;
				}
		   }
		}

		if(count==2){
			System.out.println(ld);
		}
			num=num/10;
	}
}
