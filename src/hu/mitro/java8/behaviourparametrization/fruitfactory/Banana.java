package hu.mitro.java8.behaviourparametrization.fruitfactory;

public class Banana extends Fruit {

	public Banana(String fruitname) {
		super(fruitname);
	}

	public Banana() {
		this("banana");
	}
}
