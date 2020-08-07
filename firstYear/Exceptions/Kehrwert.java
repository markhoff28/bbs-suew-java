package Exceptions;
/**
 * 
 * @author bsit18hoffmann
 * this class is an exercise for simple Exception Handling 
 *
 */

public class Kehrwert 
{
	public static double kehrwertExceptions (int value) throws Exception
	{
		if (value == 0)
		{
			throw new Exception("Durch NULL darf nicht geteilt werden");			
		}
		return 1 / Double.valueOf(value);
	}// kehrwertException end
	
	public static double kehrwertUnHandleExceptions (int value)
	{
		return 1 / Double.valueOf(value);
	}// end kehrwertUnHandleExceptions
	
	public static void main(String[] args) 
	{
		for (int i = -5; i <= 5; i ++)
		{
			try {
				System.out.printf("%.2f\n", kehrwertExceptions(i));
			} catch (Exception e) {
				System.out.println("HANDLE ERROR - " + e.getMessage());
			}// exception handling end
		}// for end
		System.out.println("--------------------------------------------------------");
		for (int i = -5; i <= 5; i ++)
		{
			try {
				System.out.printf("%.2f\n", kehrwertUnHandleExceptions(i));
			} catch (Exception e) {
				System.out.println("ERROR - " + e.getMessage());
			}// exception handling end
		}// for end
	}// main end
	
}// class end