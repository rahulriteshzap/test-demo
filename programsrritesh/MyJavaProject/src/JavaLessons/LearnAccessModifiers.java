package JavaLessons;

public class LearnAccessModifiers {
	
	   public String name;
	   public   int id;
	   public double salary;

	public static void main(String[] args)
	{
		Employee emp = new Employee(); 
		
		emp.empDetails("Rahul", 1122, 30000.00);
		
		

	}

}
class Employee
{
	 public  void empDetails(String name, int id, double salary )
		{
			 
			
			System.out.println("Employee name: "+ name);
			System.out.println("Employee id: "+ id);
			System.out.println("Employee salary: "+ salary);
			
			
			
		}
}