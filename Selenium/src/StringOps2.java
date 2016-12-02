
public class StringOps2 {

	public static void main(String[] args) 
	{
		String course="Selenium";
		String course1="selenium";
		String c=course.toUpperCase();
		String c1=course1.toUpperCase();
		if (c.equals(c1)) 
		{
			System.out.println("Both are same");
			System.out.println(c+"---"+c1);
			
			
		}
		else
		{
			System.out.println("Both are not same");
		}

	}

}
