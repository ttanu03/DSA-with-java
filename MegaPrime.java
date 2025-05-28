class MegaPrime
{
	public static void main(String[] args) 
		
	{
		int num=153;
		boolean isMegaPrime=true;
		if (prime(num))
		{

			while(num!=0){
			int ld=num%10;
			if(!prime(ld)){
			isMegaPrime=false;
			break;}
			num=num/10;
			}
			if(isMegaPrime==true)
			{
				System.out.println("number is a mega  prime");}
            else{
				System.out.println("number is  a prime but  not a mega prime");}}
		else{
			System.out.println("number is not a prime number");}
	}
	public static boolean prime(int num){
		int count=0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
			count++;}}
			if (count==2)
			{
				return true;
			}
			else{
				return false;}


}
	}

