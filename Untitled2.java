class ArmstrongBYUsingMethod 
{
	public static void main(String[] args) 
	{
		Scanner scan=new  Scanner (System.in);
		int num= scan.nextInt();
		if(exponent((count(num)))==num){
			System.out.println

	}
	public static void count(int num){
		int count=0;
		while(num!=0){
			count++;
			num=num/10;}
			return count;
}
public static void exponent(int num){
	while(num!=0){
		int expo=1;
		int ld=num%10;
		int base=ld;
		int power=count(num);
		for(int =1;i<=power;i++){
			exp=exp*base;
		}
		return exp;}
