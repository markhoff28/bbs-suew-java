package Aggregatzustand;

public class FachWasser {
	double temp;

	public double getTemp() 
	{
		return temp;
	}// getTemp end

	public void setTemp(double temp) 
	{
		this.temp = temp;
	}// setTemp end
	
	public void checkMyTemp()
	{
		if (getTemp() <= 0) 
		{
			System.out.println("fest");
		}else if (getTemp() >= 100)
		{
			System.out.println("gasförmig");
		}else {
			System.out.println("flüssig");
		}// else if end	
	}// checkmyTemp() end	
}// class end