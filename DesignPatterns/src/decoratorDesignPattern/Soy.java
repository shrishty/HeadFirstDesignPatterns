/**
 * 
 */
package decoratorDesignPattern;

/**
 * @author Shrishty
 *
 */
public class Soy extends CondimentDecorator {
	Beverage beverage;
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " Soy";
	}

	/* (non-Javadoc)
	 * @see decoratorDesignPattern.Beverage#cost()
	 */
	@Override
	public double cost() {
		return beverage.cost() + 0.10;
	}

}
