package abstarctFactory;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veeggie veeggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Calms calm;

	abstract void prepare();
	

	void bake() {
		System.out.println("Bake at 25 minutes at 350");
	}

	void cut() {
		System.out.println("Cutting the pizza at diagonal slices");
	}

	void box() {
		System.out.println("Place the pizza in the box");
	}

	public String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return null;
	}
}
