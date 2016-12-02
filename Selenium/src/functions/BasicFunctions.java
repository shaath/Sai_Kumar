package functions;

public class BasicFunctions
{

	public static void main(String[] args) 
	{
		function1();
		String res=function2();
		System.out.println(res);
		
		BasicFunctions fun=new BasicFunctions();
		fun.function3();
		boolean flag=fun.function4();
		System.out.println(flag);
		
	}
	//static Method without returning value
	public static void function1()
	{
		System.out.println("This is Function1 code");
		
	}
	//static Method with return value
	
	public static String function2()
	{
		System.out.println("This is Function2 code");
		return "Pass";
	}

	//Non static method without returning any value
	
	public void function3()
	{
		System.out.println("This is Function3 code");
	}
	
	//Non static method with returning value
	public boolean function4()
	{
		System.out.println("This is Function4 code");
		return true;
	}
}
