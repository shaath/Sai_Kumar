
public class DynamicArraysEg {

	public static void main(String[] args)
	{
		Object[] s=new Object[6];
		
		System.out.println(s.length);
		
		
		s[2]=50000;
		s[5]="Selenium";
		s[3]="Manual";
		s[2]="UFT";
		
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i]);
		}

	}

}
