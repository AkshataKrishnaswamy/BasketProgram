package com.basketprogram.main;

import java.util.Scanner;

import com.basketprogram.helper.Basket;
import com.basketprogram.helper.Catalog;
import com.basketprogram.helper.Item;

public class MainBasketApp {

	/**
	 * Program takes the contents of basket, asking for quantity of each item (Banana,Orange,Apple,Lemon,Peach)
	 * And produces the total cost of the contents in basket.
	 */
	public static void main(String[] args) {

		Basket basket = new Basket();
		int quantity;
		float unitPrice;

		Scanner userInput = new Scanner(System.in);

		System.out.println("Please enter the contents of Basket");
		System.out.println("How many Bananas?");
		quantity = userInput.nextInt();
		unitPrice = Catalog.getUnitPriceForItem("Banana");
		Item item1 = new Item("Banana",quantity,unitPrice);
		basket.addItem(item1);

		System.out.println("How many Oranges?");
		quantity = userInput.nextInt();
		unitPrice = Catalog.getUnitPriceForItem("Orange");
		Item item2 = new Item("Orange",quantity,unitPrice);
		basket.addItem(item2);

		System.out.println("How many Apples?");
		quantity = userInput.nextInt();
		unitPrice = Catalog.getUnitPriceForItem("Apple");
		Item item3 = new Item("Apple",quantity,unitPrice);
		basket.addItem(item3);

		System.out.println("How many Lemons?");
		quantity = userInput.nextInt();
		unitPrice = Catalog.getUnitPriceForItem("Lemon");
		Item item4 = new Item("Lemon",quantity,unitPrice);
		basket.addItem(item4);

		System.out.println("How many Peaches?");
		quantity = userInput.nextInt();
		unitPrice = Catalog.getUnitPriceForItem("Peach");
		Item item5 = new Item("Peach",quantity,unitPrice);
		basket.addItem(item5);

		userInput.close();
		System.out.println("Total Cost of Basket is " + basket.getTotalCost()+ " pounds");

	}


}
