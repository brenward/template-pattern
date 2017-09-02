package com.bwardweb.templatepattern;

import com.bwardweb.templatepattern.model.Cake;
import com.bwardweb.templatepattern.model.Pizza;

public class Runner {
	public static void main(String[] args){
		Cake cake = new Cake();
		Pizza pizza = new Pizza();
		
		cake.prepareItem(180);
		System.out.println("---------------------------------");
		pizza.prepareItem(250);
	}
}
