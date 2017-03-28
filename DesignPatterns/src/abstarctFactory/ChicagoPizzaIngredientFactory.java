package abstarctFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new Mozzarella();
	}

	@Override
	public Veeggie[] createVeggie() {
		Veeggie[] veggies = { new Garlic(), new Onion(), new Mashroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Calms createCalm() {
		return new FrozenCalms();
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

}
