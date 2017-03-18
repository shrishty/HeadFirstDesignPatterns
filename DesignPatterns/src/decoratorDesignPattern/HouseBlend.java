package decoratorDesignPattern;

/**
 * @author Shrishty
 *
 */
public class HouseBlend extends Beverage {

	/**
	 * Another kind of beverage.
	 */
	public HouseBlend() {
		description = "House Blend Coffee";
	}

	/* (non-Javadoc)
	 * @see decoratorDesignPattern.Beverage#cost()
	 * Overriding the cost method to return the cost of HouseBlend
	 */
	@Override
	public double cost() {
		return .89;
	}

}
