package abstarctFactory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		
		// there can be many types of pizzas 
		// like NYStylePepproniPizza, NYStyleCalmPizza etc
		// they can be added into if case similar to cheesePizza
		// and veggiePizza
		if(type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("ChicagoCheesePizza");
			return pizza;
		}
		return null;
	}
}
