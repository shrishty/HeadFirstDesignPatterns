package factoryDesignPattern;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		// there can be many types of pizzas 
		// like NYStylePepproniPizza, NYStyleCalmPizza etc
		// they can be added into if case similar to cheesePizza
		// and veggiePizza
		if(type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		}
		return null;
	}
}
