package hu.mitro.java8.behaviourparametrization.fruitfactory;

public class Apple extends Fruit {

	public Apple(String fruitname) {
		super(fruitname);
	}

	public Apple() {
		this("apple");
	}
}
