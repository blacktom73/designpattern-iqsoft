package hu.mitro.java8.behaviourparametrization.fruitfactory;

public class Orange extends Fruit {

	public Orange(String fruitname) {
		super(fruitname);
	}

	public Orange() {
		this("orange");
	}
}
