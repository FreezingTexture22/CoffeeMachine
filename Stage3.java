package CoffeeMachine;

import java.util.Scanner;

public class Stage3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Write how many ml of water the coffee machine has:");
		int water = in.nextInt();

		System.out.println("Write how many ml of milk the coffee machine has:");
		int milk = in.nextInt();

		System.out.println("Write how many grams of coffee beans the coffee machine has:");
		int coffeeBeans = in.nextInt();

		System.out.println("Write how many cups of coffee you will need:");
		int cupsRequired = in.nextInt();

		int requiredWater = cupsRequired * 200;
		int requiredMilk = cupsRequired * 50;
		int requiredCoffeeBeans = cupsRequired * 15;

		/// Counting how many cups we can make

		int waterForCups = water / 200;
		int milkForCups = milk / 50;
		int coffeBeansForCups = coffeeBeans / 15;

		int maxCups = waterForCups;

		if (milkForCups < maxCups) {
			maxCups = milkForCups;
		}

		if (coffeBeansForCups < maxCups) {
			maxCups = coffeBeansForCups;
		}

		/// printing out the result
		if (cupsRequired < maxCups) {
			System.out.println(
					"Yes, I can make that amount of coffee (and even " + (maxCups - cupsRequired) + " more than that)");
		} else if (cupsRequired == maxCups) {
			System.out.println("Yes, I can make that amount of coffee");
		} else {
			System.out.println("No, I can make only " + maxCups + " cup(s) of coffee");
		}
	}

}
