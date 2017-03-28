package abstarctFactory;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		// there can be many types of pizzas 
		// like NYStylePepproniPizza, NYStyleCalmPizza etc
		// they can be added into if case similar to cheesePizza
		// and veggiePizza
		if(type.equals("cheese")) {
			pizza =  new CheesePizza(ingredientFactory);
			pizza.setName("NYCheesePizza");
			return pizza;
		}
		
		return null;
	}
}
