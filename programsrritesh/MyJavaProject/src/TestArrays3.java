import java.util.ArrayList;

public class TestArrays3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> obj = new ArrayList<Integer>(); // creating arraylist object
		// adding the values to the array list.
		obj.add(1);
		obj.add(12);
		obj.add(13);
		obj.add(14);
		
		/* Two ways to iterate the elements of collection in java
		 * 1. By Iterator Interface
		 * 2. By for-each loop
		 * */
		// iterating the values using for each loop
		
		for (Integer value : obj){
			System.out.println(value);
		}
		

		ArrayList<String> name = new ArrayList<String>();
		name.add("Rahul");
		name.add("Ritesh");
		name.add("Zap");
		
		for(String studentName : name){
			
			System.out.println(studentName);
		}
		
		
		
		
	}

}
