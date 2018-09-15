import java.util.ArrayList;
import java.util.Arrays;

public class TestArraysAsList {

	public static void main(String[] args) {
		
		ArrayList<String> obj = new ArrayList<String>(Arrays.asList("java","python","statistics"));
		
		System.out.println("Elements are:-"+ obj);
		
		/* Anonymous inner class method to initialize ArrayList */
          
		ArrayList<String> Cities = new ArrayList<String>()
				{{
					add("Bangalore");
					add("Patna");
					add("Goa");
					
					
					
				}};
		System.out.println("Content of ArrayList cities" + Cities);
	}

}
