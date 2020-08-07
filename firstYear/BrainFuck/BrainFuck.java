package BrainFuck;

public class BrainFuck {
	
	public static int myCount = 0;
	
	public static void doIT (int a)
	{
		if (a > 1) 
		{
			doIT((a / 3));
		}
		
		if (a > 1) 
		{
			doIT((a / 2));
		}
		System.out.println(a);
		
		myCount++;

	}
	
	public static void main(String[] args)
	{
		doIT(10);
		System.out.println("count: " + myCount);
	
	}
}
