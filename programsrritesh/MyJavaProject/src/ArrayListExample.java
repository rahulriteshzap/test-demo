import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {

	public static void main(String[] args) {
		/*Creation of arraylist of string type
		 * 
		 */
                
		ArrayList<String> obj = new ArrayList<String>();
		
		/* This is how the elements to be added to the ArrayList */
		obj.add("Rahul");
		obj.add("Ritesh");
		obj.add("Zap");
		obj.add("Riteshon");
		
		/* Displaying the array list elements */
		System.out.println("ArrayList Elemets"+obj);
		
		/* Adding the element at the given index*/
		obj.add(0,"java");
		obj.add(1, "Python");
		System.out.println("UpdatedArrayList Elemets"+obj);
		
		
	}
	

}
