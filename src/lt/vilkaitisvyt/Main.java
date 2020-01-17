package lt.vilkaitisvyt;

public class Main {

	public static void main(String[] args) {
		
		CoffeeMakerTerminal cmt = new CoffeeMakerTerminal(new CoffeeMaker());
		
		boolean ats = true;
		while(ats == true) {
			try {
				ats = cmt.terminalStart();
			} catch (NumberFormatException e) {
				try {
					throw new WrongOptionsSelectedException("Please select the options from the list\n");
				} catch (WrongOptionsSelectedException ex) {
					System.err.println(ex);
				}
			} catch (CoffeeMakerIsOffException e) {
				System.err.println(e);
			} catch (CappuccinoMechanismUnwashedException e) {
				System.err.println(e);
			} catch (NoCoffeeBeansException e) {
				System.err.println(e);
			} catch (OutOfMilkException e) {
				System.err.println(e);
			} catch (OutOfWaterException e) {
				System.err.println(e);
			} catch (Exception e) {
				System.err.println("Something went wrong :<\n");
			}
		}

	}
}
