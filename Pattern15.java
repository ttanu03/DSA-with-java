class Pattern15 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int sum=0;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				System.out.print(sum+ "\t");
				a=b;
				b=sum;
				sum=a+b;}
		System.out.println();

		}
	}
}
