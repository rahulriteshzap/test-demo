package BeginnersBook;
/*Every java application must have at least one class definition that consists of class keyword followed by class name. When I say keyword, it means that it should not be changed, we should use it as it is. However the class name can be anything.
 * 
 * I have made the class public by using public access modifier, I will cover access modifier in a separate post, all you need to know now that a java file can have any number of classes but it can have only one public class and the file name should be same as public class name.
 * 
 * 
 * */
public class MyFirstJavaProgram
{

	/*public static void main(String[] args)
 public: This makes the main method public that means that we can call the method from outside the class.
	static: We do not need to create object for static methods to run. They can run itself.
	void: It does not return anything.
	main: It is the method name. This is the entry point method from which the JVM can run your program.
	(String[] args): Used for command line arguments that are passed as strings. We will cover that in a separate post.*/
	{
		
		System.out.println("This is my first program in java");// This method prints the contents inside the double quotes into the console and inserts a newline after.

	}

}
