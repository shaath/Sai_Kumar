import java.util.ArrayList;


public class ArrayListEg {

	public static void main(String[] args) 
	{
		ArrayList<Object> Anushka=new ArrayList<Object>();
		
		
		// Writing the data into the array
		
		Anushka.add("Sharath");
		Anushka.add("Selenium");
		Anushka.add("Manual");
		Anushka.add(40000);
		
		
		//Finding the length of the array
		
		System.out.println(Anushka.size());
		
		//Reading the data from the arraylist
		
		for (int i = 0; i < Anushka.size(); i++) 
		{
			System.out.println(Anushka.get(i));
		}
		

	}

}
