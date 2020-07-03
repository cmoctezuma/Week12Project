package application;

import java.util.Scanner;

public class menu {

	public static void ShowMenu() {

	}

	public static void showOptions() {

		System.out.println("Welcome to Dominoes, please select an option below");
		System.out.println("1) Existing Customer");
		System.out.println("2) New Customer");
		System.out.println("3) Select nearest restaurant location");
		System.out.println("4) Show menu");
		System.out.println("5) Add items to order");
		System.out.println("6) Adjust quantity of items");
		System.out.println("7) Remove items from order");
		System.out.println("8) Show your order");
		System.out.println("9) Complete order");

		processOrder();
	}

	public static void processOrder() {
		Scanner sc = new Scanner(System.in);
		String order = "-1";
		String item = " ";
		String customer_name = " ";
		String address = " ";
		String phone_number = " ";
		String description = " ";
		int customer_id = 0;
		int quantity = 0;
		int id = 0;
		int restaurant_id = 0;
		Double price = 0.00;


		do {
			order = sc.nextLine();

			if (order.equals("1")) {
				System.out.println("Welcome Back! Enter name");
				customer_name = sc.nextLine();
				main.getCustomerId(customer_name);
			} else if (order.equals("2")) {
				System.out.println("Enter name");
				customer_name = sc.nextLine();
				System.out.println("Enter address");
				address = sc.nextLine();
				System.out.println("Enter phone number");
				phone_number = sc.nextLine();
				main.createProfile(customer_name, address, phone_number);
			} else if (order.equals("3")) {
				System.out.println("Select location: \n 1)Uptown \n 2)Downtown \n 3)Midtown");
				System.out.println("Enter id of restaurant location");
				restaurant_id = sc.nextInt();
				main.getRestaurantId(id);
			} else if (order.equals("4")) {
				System.out.println("Here is the list of items");
				main.showMenu();
			} else if (order.equals("5")) {
				System.out.println("What would you like to order?");
				item = sc.nextLine();
				System.out.println("How much would you like to order?");
				quantity = sc.nextInt();
				main.addItem(item, quantity);
			} else if (order.equals("6")) {
				System.out.println("Enter item you would like to update");
				item = sc.nextLine();
				System.out.println("How many would you like to order?");
				quantity = sc.nextInt();
				main.updateQuantity(item, quantity);
			} else if (order.equals("7")) {
				System.out.println(" Enter id for item you would like to delete");
				id = sc.nextInt();
				main.removeItem(id);
			} else if (order.equals("8")) {
				System.out.println("What is your customer_id");
				id = sc.nextInt();
				main.showCustomerOrder(id);
			} else if (order.equals("9")) {
				System.out.println(" Your order is complete, please expect 20 mins for delivery");

				break;
			} else {
				main.invalidSelection();
			}

		} while (order.equals("-1"));
	}

}