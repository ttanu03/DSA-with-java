class Pattern29 
{
		public static void main(String[]args){
			for(int i=0;i<=5;i++)
				{
				int n=1;
				int num=i;
				int den=1;
				for(int j=5;j>=0;j--)
					{
					if(j<=i)
						{
						System.out.print(" "+n);
						n=n*num/den;
						num--;
						den++;
						}
						else{
							System.out.print(" ");
						}
					}
					System.out.println();
				}

	}
}
