package abstarctFactory;

public interface PizzaIngredientFactory {
	public abstract Dough createDough();

	public abstract Sauce createSauce();

	public abstract Cheese createCheese();

	public abstract Veeggie[] createVeggie();

	public abstract Calms createCalm();

	public abstract Pepperoni createPepperoni();
}
