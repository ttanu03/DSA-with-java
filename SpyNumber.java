./class SpyNumber 
{
	public static void main(String[] args) 
	{
		int num=54670;
		0int sum=0;
		int mul=1;
		while(num!=0){
			int ld=num%10;
			sum=sum+ld;
			mul=mul*ld;
			num=num/10;}
	    if(sum==mul){
        System.out.println("number is a spyy number");
	     }
		 else{
			 System.out.println("number is not");
		 }
	}

}
