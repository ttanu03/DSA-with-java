class ArmstrongNumber 
{
	public static void main(String[] args) 
	{int num=153;
	int temp=num;
	int Num=temp;
	int count=0;
	int sum=0;
	while(num!=0){
		count++;
		num=num/10;
	}
	while(temp!=0){
		int exp=1;
		int ld=temp/10;
		;
		for(int i=1;i<=count;i++){
			exp=exp*ld;
			}

			sum=sum+exp;
			temp=temp/10;
			
	}
	if(sum==Num){
		System.out.println("Number is a Armstrong number");
	}
	else{
		System.out.println("Number is not");
	}
	}
}
