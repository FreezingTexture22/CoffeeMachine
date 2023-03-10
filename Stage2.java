package CoffeeMachine;

import java.util.Scanner;

public class Stage2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Write how many cups of coffee you will need: ");

		int cups = in.nextInt();
		int water = 200;
		int milk = 50;
		int coffeeBeans = 15;

		System.out.println("For " + cups + " cups of coffee you will need:");
		System.out.println(cups * water + " ml of water");
		System.out.println(cups * milk + " ml of milk");
		System.out.println(cups * coffeeBeans + " g of coffee beans");

	}
}
