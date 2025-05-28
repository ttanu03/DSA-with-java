class HalfNumber
{ 
	public static void main(String[] args){
	int num=123488;
	int temp=num;
	int count=0;
	while(num!=0){
		int ld=num%10;
		  count++;
			num=num/10;
	}
	if(count%2==0){
	int base=10;
	int power=count/2;
	int exp=1;
	for (int i=1;i<=power;i++ ){
		exp=exp*base;}

	int firstNumber=temp/exp;
	int secondNumber=temp%exp;
	
		System.out.println(firstNumber);
		System.out.println(secondNumber);}
	else{
		System.out.println("number will not be divided");
	}
	
	}
}
