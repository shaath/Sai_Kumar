import java.util.Scanner;


public class IfEg 
{

	public static void main(String[] args) 
	{
//	  int a=3000;
//	  int b=4000;
		
	  Scanner sc=new Scanner(System.in);
		
	  int a=sc.nextInt();
	  
	  int b=sc.nextInt();
	  
	  System.out.println(a +"-----"+ b);
	  
	  if( a > b )
	  {
		  System.out.println("A is greater");
	  }
	  else
	  {
		  System.out.println("B is greater");
	  }
	 

	}

}
