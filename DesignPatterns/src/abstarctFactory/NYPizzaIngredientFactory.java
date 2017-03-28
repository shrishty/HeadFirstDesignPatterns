package abstarctFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veeggie[] createVeggie() {
		Veeggie[] veggies = { new Garlic(), new Onion(), new Mashroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Calms createCalm() {
		return new FreshCalms();
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

}
