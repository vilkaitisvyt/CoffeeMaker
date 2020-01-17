package lt.vilkaitisvyt;

public class CoffeeMaker {
	
	private boolean online;
	private int water;
	private int coffeeBeans;
	private int milk;
	private int cappuccinoMechanism;
	
	public CoffeeMaker() {
		this.online = false;
		this.water = 0;
		this.coffeeBeans = 0;
		this.milk = 0;
		this.cappuccinoMechanism = 0;
	}
	
	public void makeEspresso() throws Exception {
		if (!online) {
			throw new CoffeeMakerIsOffException("Coffee maker offline\n");
		}
		if (water == 0) {
			throw new OutOfWaterException("No water in the coffee maker\n");
		}
		if(coffeeBeans == 0) {
			throw new NoCoffeeBeansException("No coffee beans in the coffee maker\n");
		}
		this.water -= 1;
		this.coffeeBeans -= 1;
		System.out.println("1 Espresso ready\n");
	}
	
	public void makeCappuccino() throws Exception {
		if (!online) {
			throw new CoffeeMakerIsOffException("Coffee maker offline\n");
		}
		if (water == 0) {
			throw new OutOfWaterException("No water in the coffee maker\n");
		}
		if(coffeeBeans == 0) {
			throw new NoCoffeeBeansException("No coffee beans in the coffee maker\n");
		}
		if(milk == 0) {
			throw new OutOfMilkException("No milk\n");
		}
		if(cappuccinoMechanism >= 7) {
			throw new CappuccinoMechanismUnwashedException("Wash the cappuccino mechanism\n");
		}
		this.water -= 1;
		this.coffeeBeans -= 1;
		this.milk -= 1;
		this.cappuccinoMechanism += 1;
		System.out.println("1 Cappuccino ready\n");
	}
	
	public void powerButton() {
		this.online = true;
	}
	
	public void addWater() {
		this.water = 15;
	}
	
	public void addCoffeeBeans() {
		this.coffeeBeans = 5;
	}
	
	public void addMilk() {
		this.milk = 10;
	}
	
	public void washCappuccinoMechanism() {
		this.cappuccinoMechanism = 0;
	}

}
