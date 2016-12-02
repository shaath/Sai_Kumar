
public class StringOps3
{
	public static void main(String[] args)
	{
		String s="Anusha";//egdEQ
		
		int len=s.length();
		System.out.println(len);
//		
//		char x=s.charAt(2);
//		System.out.println(x);
		
		for (int i = 0; i < len; i++) 
		{
			System.out.println(s.charAt(i));
		}
		System.out.println("-------------------");
		
		for (int i = len-1; i >= 0; i--) 
		{
			System.out.println(s.charAt(i));
		}
		
		System.out.println("-------------------");
		
		for (int i = len-1; i >= 0; i--) 
		{
			System.out.print(s.charAt(i));
		}
	}

}
