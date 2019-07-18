package hu.mitro.java8.behaviourparametrization.fruitfactory;

public abstract class Fruit {

	String fruitname;

	public Fruit(String fruitname) {
		this.fruitname = fruitname;
	}

	public String getFruitname() {
		return fruitname;
	}
}
