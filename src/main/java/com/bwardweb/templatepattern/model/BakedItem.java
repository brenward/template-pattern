package com.bwardweb.templatepattern.model;

public abstract class BakedItem {

	public final void prepareItem(int temperature){
		turnOnOven(temperature);
		addIngredients();
		mixIngredients();
		putInOven();
		leaveToCool();
	}
	
	public final void turnOnOven(int temperature){
		System.out.println("Preheating oven to " + temperature + " degrees");
	}
	
	public abstract void addIngredients();
	
	public final void mixIngredients(){
		System.out.println("Mixing ingredients");
	}
	
	public final void putInOven(){
		System.out.println("Baking");
	}
	
	public void leaveToCool(){
		
	}
}
