
public class TestArray2 {

	public static void main(String[] args) {
		
		int arr1[];// declaration of array
		int []arr2; // declaration of array
		int arr3[]= {1,2,3,4}; // this statement declare, construct and initialize the array
		int rahul [] = new int[6];
		rahul[0]=1;
		rahul[1]=2;
		rahul[2]=3;
		rahul[3]=4;
		rahul[4]=5;
		rahul[5]=6;
		/* 
		 * this statement creates an array of size 6 on the heap, for creation of array object the jvm needs to know the
		 * size of the space to be allocated to the object, so the size needs to be specified succeeding the new keyword.
		 */
		// initialization using for loop
		int ritesh [] = new int [5];
		
		for (int i=0;i<ritesh.length;i++)
		{
			ritesh [i]=i+1;
			//System.out.println(ritesh[i]);
		
	    }
		
		for (int i=0;i<ritesh.length;i++)
		{
			System.out.println(ritesh[i]);
		}
		
		int arr4[]=null;
		System.out.println(arr4[0]); // The above statement will makes the array to point to null, means the array
		    // object which was on the heap is ready for garbage collection
		// So refering to array object will now gives a NULL POINTER EXCEPTION
		
		
	}
	 

}
