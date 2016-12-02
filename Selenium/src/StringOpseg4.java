
public class StringOpseg4 {

	public static void main(String[] args)
	{
		String s="Anusha";
		
		 System.out.println(s.substring(2, 6));
		 
		 if (s.contains(s.substring(2, 6)))
		 {
			System.out.println("Pass");
		}
		 else
		 {
			 System.out.println("Fail");
		 }
	}

}
