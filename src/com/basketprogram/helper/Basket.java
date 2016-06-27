package com.basketprogram.helper;

import java.util.ArrayList;
import java.util.List;

public class Basket {

	private List<Item> itemList = new ArrayList<>();

	private float totalPrice;

	public List<Item> addItem(Item item){
		itemList.add(item);
		return itemList;
	}

	public float getTotalCost(){
		for(Item item : itemList){
			totalPrice+=item.getUnitPrice()*item.getQuantity();
		}
		return totalPrice;
	}

}
