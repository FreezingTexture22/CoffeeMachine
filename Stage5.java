package CoffeeMachine;

import java.util.Scanner;

public class Stage5 {
	static boolean exit = false;
	static int currentMoney = 550;
	static int currentWater = 400;
	static int currentMilk = 540;
	static int currentCoffeeBeans = 120;
	static int currentCups = 9;

	public static void main(String[] args) {
		menu();

	}

	public static void menu() {

		while (!exit) {
			Scanner in = new Scanner(System.in);
			System.out.println("Write action (buy, fill, take, remaining, exit): ");
			String input = in.nextLine();

			switch (input) {

			case "buy" -> buy();
			case "fill" -> fill();
			case "take" -> take();
			case "remaining" -> remaining();
			case "exit" -> exit = true;

			}
		}

	}

	static void buy() {
		Scanner in = new Scanner(System.in);
		System.out.println();
		System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");

		String input = in.nextLine();

		switch (input) {
		case "1" -> makeEspresso();
		case "2" -> makeLatte();
		case "3" -> makeCappuccino();

		case "back" -> {
			System.out.println();
			menu();
		}

		default -> {

		}

		}

	}

	static void fill() {
		Scanner in = new Scanner(System.in);

		System.out.println();
		System.out.println("Write how many ml of water you want to add: ");
		currentWater = currentWater + in.nextInt();

		System.out.println("Write how many ml of milk you want to add: ");
		currentMilk = currentMilk + in.nextInt();

		System.out.println("Write how many grams of coffee beans you want to add: ");
		currentCoffeeBeans = currentCoffeeBeans + in.nextInt();

		System.out.println("Write how many disposable cups you want to add: ");
		currentCups = currentCups + in.nextInt();
		System.out.println();

	}

	static void take() {
		System.out.println();
		System.out.println("I gave you $" + currentMoney);
		System.out.println();

		currentMoney = 0;

		menu();

	}

	static void remaining() {
		System.out.println();
		System.out.println("The coffee machine has:");
		System.out.println(currentWater + " ml of water");
		System.out.println(currentMilk + " ml of milk");
		System.out.println(currentCoffeeBeans + " g of coffee beans");
		System.out.println(currentCups + " disposable cups");
		System.out.println("$" + currentMoney + " of money");
		System.out.println();
		menu();

	}

	static void makeEspresso() {
		int requiredWater = 250;
		int requiredMilk = 0;
		int requiredCoffeeBeans = 16;
		int requiredCups = 1;
		int price = 4;

		checkBeforeBuy(requiredWater, requiredMilk, requiredCoffeeBeans, requiredCups, price);

		System.out.println();
		menu();
	}

	static void makeLatte() {

		int requiredWater = 350;
		int requiredMilk = 75;
		int requiredCoffeeBeans = 20;
		int requiredCups = 1;
		int price = 7;

		checkBeforeBuy(requiredWater, requiredMilk, requiredCoffeeBeans, requiredCups, price);

		System.out.println();
		menu();
	}

	static void makeCappuccino() {

		int requiredWater = 200;
		int requiredMilk = 100;
		int requiredCoffeeBeans = 12;
		int requiredCups = 1;
		int price = 6;

		checkBeforeBuy(requiredWater, requiredMilk, requiredCoffeeBeans, requiredCups, price);

		System.out.println();
		menu();
	}

	static void checkBeforeBuy(int requiredWater, int requiredMilk, int requiredCoffeeBeans, int requiredCups,
			int price) {

		if (currentWater < requiredWater) {
			System.out.println("Sorry, not enough water!");
			System.out.println();
			menu();

		} else if (currentMilk < requiredMilk) {
			System.out.println("Sorry, not enough milk!");
			System.out.println();
			menu();

		} else if (currentCoffeeBeans < requiredCoffeeBeans) {
			System.out.println("Sorry, not enough coffee beans!");
			System.out.println();
			menu();

		} else if (currentCups < requiredCups) {
			System.out.println("Sorry, not enough coffee cups!");
			System.out.println();
			menu();
		} else {

			System.out.println("I have enough resources, making you a coffee!");
			System.out.println();
			saleCoffee(requiredWater, requiredMilk, requiredCoffeeBeans, requiredCups, price);
			menu();

		}
	}

	static void saleCoffee(int requiredWater, int requiredMilk, int requiredCoffeeBeans, int requiredCups, int price) {

		currentWater = currentWater - requiredWater;
		currentMilk = currentMilk - requiredMilk;
		currentCoffeeBeans = currentCoffeeBeans - requiredCoffeeBeans;
		currentMoney = currentMoney + price;
		currentCups = currentCups - requiredCups;
	}

}