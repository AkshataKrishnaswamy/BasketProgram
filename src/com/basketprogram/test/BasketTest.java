package com.basketprogram.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.basketprogram.helper.Basket;
import com.basketprogram.helper.Catalog;
import com.basketprogram.helper.Item;

public class BasketTest {
   
	private Basket basket;
	
	@Before
	public void setUp() throws Exception {
	    basket = new Basket();
		basket.addItem(new Item("Banana",2,Catalog.getUnitPriceForItem("Banana")));
		basket.addItem(new Item("Orange",1,Catalog.getUnitPriceForItem("Orange")));
		basket.addItem(new Item("Apple",1,Catalog.getUnitPriceForItem("Apple")));
		basket.addItem(new Item("Lemon",1,Catalog.getUnitPriceForItem("Lemon")));
		basket.addItem(new Item("Peach",0,Catalog.getUnitPriceForItem("Peach")));
	}

	
	@Test
	public void testGetTotalCost() {
		assertEquals(9.0f,basket.getTotalCost(),0.0f);
	}

}
