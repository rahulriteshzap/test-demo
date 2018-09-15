/* Print prime numbers
 * A number which is divisible by 1 and itself- A prime number is a whole number greater than 1 whose only factors are 1
 * and itself.
 * A factor is a whole numbers that can be divided evenly into another number. The first few prime numbers are 2, 3, 5,
 *  7, 11, 13, 17, 19, 23 and 29. Numbers that have more than two factors are called composite numbers. 
 *  The number 1 is neither prime nor composite. 
 *  
 */
//Program to display the prime numbers from 1 to 100
public class PrimeNumbers {

	public static void main(String[] args) {
		int num=50;
		int count=0;
		for (int i=2;i<=num;i++)
		{
			count=0;
			for (int j=2;j<=i/2;j++)
			{
				if (i%j==0)
				{
					count++;
					break;
				}
			}
			
			if (count ==0)
			{
				System.out.println(i);
			}
		}
		
		

	}

}
