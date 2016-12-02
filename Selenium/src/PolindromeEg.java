
public class PolindromeEg {

	public static void main(String[] args)
	{
		String Original="Dad";
		String Reverse="";
		
		int len=Original.length();
				
		for (int i = len-1; i >= 0; i--)
		{
			Reverse=Reverse+Original.charAt(i);
			
		}		
		System.out.println(Reverse);//daD
		
		if (Original.equalsIgnoreCase(Reverse))
		{
			System.out.println("Given String is polindrome");
		}
		else
		{
			System.out.println("Given String is not a polindrome");
		}
	}

}
