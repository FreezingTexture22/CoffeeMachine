package CoffeeMachine;

import java.util.Scanner;

public class Stage4 {
	static int currentMoney = 550;
	static int currentWater = 400;
	static int currentMilk = 540;
	static int currentCoffeeBeans = 120;
	static int currentCups = 9;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		status();
		System.out.println("Write action (buy, fill, take): ");
		String input = in.nextLine();

		switch (input) {

		case "buy" -> buy();
		case "fill" -> fill();
		case "take" -> take();

		}

	}

	public static void buy() {
		Scanner in = new Scanner(System.in);
		System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");

		int input = in.nextInt();

		switch (input) {
		case 1 -> {
			currentWater = currentWater - 250;
			currentCoffeeBeans = currentCoffeeBeans - 16;
			currentMoney = currentMoney + 4;
			currentCups = currentCups - 1;
		}

		case 2 -> {
			currentWater = currentWater - 350;
			currentMilk = currentMilk - 75;
			currentCoffeeBeans = currentCoffeeBeans - 20;
			currentMoney = currentMoney + 7;
			currentCups = currentCups - 1;
		}

		case 3 -> {
			currentWater = currentWater - 200;
			currentMilk = currentMilk - 100;
			currentCoffeeBeans = currentCoffeeBeans - 12;
			currentMoney = currentMoney + 6;
			currentCups = currentCups - 1;
		}

		default -> {

		}

		}

		status();
	}

	public static void fill() {
		Scanner in = new Scanner(System.in);

		System.out.println("Write how many ml of water you want to add: ");
		currentWater = currentWater + in.nextInt();

		System.out.println("Write how many ml of milk you want to add: ");
		currentMilk = currentMilk + in.nextInt();

		System.out.println("Write how many grams of coffee beans you want to add: ");
		currentCoffeeBeans = currentCoffeeBeans + in.nextInt();

		System.out.println("Write how many disposable cups you want to add: ");
		currentCups = currentCups + in.nextInt();

		status();
	}

	public static void take() {
		System.out.println("I gave you $" + currentMoney);
		System.out.println();
		currentMoney = 0;

		status();
	}

	public static void status() {
		System.out.println("The coffee machine has:");
		System.out.println(currentWater + " ml of water");
		System.out.println(currentMilk + " ml of milk");
		System.out.println(currentCoffeeBeans + " g of coffee beans");
		System.out.println(currentCups + " disposable cups");
		System.out.println("$" + currentMoney + " of money");
		System.out.println();

	}

}
