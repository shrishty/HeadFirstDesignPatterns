package factoryDesignPattern;

public class NYStyleVeggiePizza extends Pizza {

	public NYStyleVeggiePizza() {
		name = "NY Style Sauce and veggie pizza";
		dough = "Thin Crust dough";
		sauce = "Minarada Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}

}
