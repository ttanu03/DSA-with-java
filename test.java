class EvenDigit 
{
	public static void main(String[] args) 
	{
		int num=1234;
		while(num!=0){
		int ld=num%10;
		if(ld%2==0){
			System.out.println(ld);
			num=num/10;
        }
		}
	}
}
