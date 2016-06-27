package com.basketprogram.helper;

public class Catalog {
	/**
	 * @return the unit price of the item
	 */

	public static float getUnitPriceForItem(String itemName){
		float price;
		if("Banana".equalsIgnoreCase(itemName)){
			price = 1;
		}else if("Orange".equalsIgnoreCase(itemName)){
			price = 2;
		}else if("Apple".equalsIgnoreCase(itemName)){
			price = 3;
		}else if("Lemon".equalsIgnoreCase(itemName)){
			price = 2;
		}else if("Peach".equalsIgnoreCase(itemName)){
			price = 4;
		}else{
			price = 0;
		}
		return price;
	}
}
