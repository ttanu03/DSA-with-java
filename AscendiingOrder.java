class AscendingOrder 
{
	public static void main(String[] args) 
	{
		int num= 8901;
		int smallNumber=0;
		while (num!=0)
		{
			int ld=num%10;
			if(smallNumber<ld){
				System.out.println(smallNumber);}
             else{ 
				 System.out.println(ld);
				 smallNumber=ld;
			 }
				 num=num/10;}
		}


		
		
	}
}
