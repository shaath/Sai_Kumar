
public class StaticArrayEg1 {

	public static void main(String[] args) 
	{
//		int[] salary={30000,40000,50000,60000,70000,80000};
		
		Object[] salary={30000,"Selenium",'k',44444.444,true};

		
		System.out.println(salary.length);
		
//		System.out.println(salary[3]);
		
		for (int i = 0; i < salary.length; i++)
		{
			System.out.println(salary[i]);
		}
		
		
	}

}
