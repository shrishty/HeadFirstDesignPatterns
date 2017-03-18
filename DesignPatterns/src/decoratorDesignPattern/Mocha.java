package decoratorDesignPattern;

/**
 * @author Shrishty
 *
 */
public class Mocha extends CondimentDecorator {

	/**
	 *	Mocha is a condiment which is added to a concrete beverage.
	 *	So we must pass the beverage object to which the condiment is
	 *  being added
	 */
	
	Beverage beverage;
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	/* (non-Javadoc)
	 * @see decoratorDesignPattern.CondimentDecorator#getDescription()
	 * 
	 */
	@Override
	public String getDescription() {
		return beverage.getDescription() + " " + "Mocha!!";
	}

	/* (non-Javadoc)
	 * @see decoratorDesignPattern.Beverage#cost()
	 */
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + .20;
	}

}
