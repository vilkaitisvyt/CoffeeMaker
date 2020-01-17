package lt.vilkaitisvyt;

import java.util.Scanner;

public class CoffeeMakerTerminal {
	Scanner reader = new Scanner(System.in);
	
	private CoffeeMaker coffeeMaker;
	
	public CoffeeMakerTerminal(CoffeeMaker coffeeMaker) {
		this.coffeeMaker = coffeeMaker;
	}
	
	public boolean terminalStart() throws Exception {
		System.out.println("0 - to exit");
		System.out.println("1 - to turn the CoffeeMaker on");
		System.out.println("2 - for espresso");
		System.out.println("3 - for cappuccino");
		System.out.println("4 - to add water");
		System.out.println("5 - to add coffee beans");
		System.out.println("6 - to add milk");
		System.out.println("7 - to clean cappuccino mechanism\n");
		int input = Integer.parseInt(reader.nextLine().trim());
		if (input < 0 || input > 7) {
			throw new WrongOptionsSelectedException("Please select the options from the list\n");
		} else if (input == 0) {
			return false;
		} else if (input == 1) {
			coffeeMaker.powerButton();
		} else if (input == 2) {
			coffeeMaker.makeEspresso();
		} else if (input == 3) {
			coffeeMaker.makeCappuccino();
		} else if (input == 4) {
			coffeeMaker.addWater();
		} else if (input == 5) {
			coffeeMaker.addCoffeeBeans();
		} else if (input == 6) {
			coffeeMaker.addMilk();
		} else if (input == 7) {
			coffeeMaker.washCappuccinoMechanism();
		}
		return true;
	}
}
