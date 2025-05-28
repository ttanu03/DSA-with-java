class Practice  
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=1000;i++){
			int num=i;
			int sum=0;
			int mul=1;
			while(num!=0){
				int ld= num%10;
				sum=sum+ld;
				mul=mul*ld; 
				if(sum==mul){
					System.out.println(i);}
					num=num/10;
			}

			
		}
	}

}
