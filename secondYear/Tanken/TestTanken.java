package Tanken;

import java.util.Scanner;

public class TestTanken {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		FachklasseTanken tank = new FachklasseTanken();
		tank.initTabelle();
		
		String input = "";
		while (!input.equalsIgnoreCase("x")) {
			System.out.println("Bitte die Belege eingeben[n] Reset r und beenden x");
			input = sc.nextLine();
			if (input.equalsIgnoreCase("n")) {
				System.out.println();
				tank.collectBill();
				System.out.println();
				tank.printTabelle();
			}else if(input.equalsIgnoreCase("r")) {
				tank.initTabelle();
				System.out.println();
				tank.printTabelle();
			}
			System.out.println("Exit from Brexit");
		}
		
	}

}
