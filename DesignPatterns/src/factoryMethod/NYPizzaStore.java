package factoryMethod;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		// there can be many types of pizzas 
		// like NYStylePepproniPizza, NYStyleCalmPizza etc
		// they can be added into if case similar to cheesePizza
		// and veggiePizza
		if(type.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (type.equals("veggie")) {
			return new NYStyleVeggiePizza();
		}
		return null;
	}
}
