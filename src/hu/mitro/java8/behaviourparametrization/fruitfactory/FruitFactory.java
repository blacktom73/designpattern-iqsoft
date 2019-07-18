package hu.mitro.java8.behaviourparametrization.fruitfactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;


public class FruitFactory {

	private Map<String, Supplier<Fruit>> suppliers;

	public FruitFactory() {
		suppliers = new HashMap<>();
		suppliers.put("a", Apple::new);
		suppliers.put("o", Orange::new);
		suppliers.put("b", Banana::new);
	}

	public Fruit create(String s) {
		return suppliers.get(s).get();
	}

}
