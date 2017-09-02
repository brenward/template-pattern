package com.bwardweb.templatepattern.model;

public class Cake extends BakedItem{

	@Override
	public void addIngredients() {
		System.out.println("Adding flour");
		System.out.println("Adding sugar");
		System.out.println("Adding eggs");
		System.out.println("Adding flavouring");
	}
	
	public void leaveToCool(){
		System.out.println("Leaving to cool for 10 mins");
	}

}
