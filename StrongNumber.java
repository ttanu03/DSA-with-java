class StrongNumber
{
	public static void main(String[] args) 
	{
		int num=145;
		int temp=num;
		
		int sum=0;
		while(num!=0){
			int mul=1;
			int ld=num%10;
			for(int i=1;i<=ld;i++){
				mul=mul*i;
			}
			sum=sum+mul;
			num=num/10;
			}

	
		if(sum==temp){
			System.out.println("Number is Strong number");}
		else{
		System.out.println("Not a strong number");}
	}

}
