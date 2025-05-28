import java.util.Scanner;
class StringsEqual 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		boolean isEqual=true;
		System.out.println("Give the first string");
		String s1= sc.nextLine();
		System.out.println("Give the second string");
		String s2= sc.nextLine();
		if(s1.length()==s2.length())
		{
			System.out.println("String is not equal");
		}
		else{

		for(int i=0;i<=s1.length()-1;i++)
		{
			if(s1.charAt(i)==s2.charAt( 
			
		
				{
				isEqual=false;
				break;
				}
				i++;
				j++;
			}
		}
		if(isEqual==true)
		{
			System.out.println("String is equal");
		}
		else{
			System.out.println("String is not equal");
		}




		}
		
	}
}
