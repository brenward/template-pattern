package com.bwardweb.templatepattern.model;

public class Pizza extends BakedItem{

	@Override
	public void addIngredients() {
		System.out.println("Rolling Dough");
		System.out.println("Adding sauce");
		System.out.println("Adding cheese");
		System.out.println("Adding toppings");		
	}

}
