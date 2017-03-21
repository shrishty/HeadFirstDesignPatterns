package factoryDesignPattern;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
	
	void prepare() {
		System.out.println("preparing " + name);
		System.out.println("Tossing dough");
		System.out.println("Adding Sauce");
		System.out.println("Adding toppings");
		
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println(" " + toppings.get(i));
		}
	}
	
	void bake() {
		System.out.println("Bake at 25 minutes at 350");
	}
	
	void cut() {
		System.out.println("Cutting the pizza at diagonal slices");
	}
	
	void box() {
		System.out.println("Place the pizza in the box");
	}
	
	public String getName() {
		return name;
	}
}
