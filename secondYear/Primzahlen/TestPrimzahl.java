package Primzahlen;

import java.util.concurrent.TimeUnit;

public class TestPrimzahl {

	public static void main(String[] args) 
	{
		FachPrimzahl myPrim = new FachPrimzahl();
		myPrim.setNumber(100_000_000);
		long start = System.nanoTime();
		myPrim.calcCount();
		
		//myPrim.zeigePrimzahl();
		long stopp = System.nanoTime();
		long time = stopp - start;
		time = TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS);
		System.out.println(time);
		myPrim.zeigeDurchgaenge();
		}

}
