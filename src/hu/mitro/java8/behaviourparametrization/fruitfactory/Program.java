package hu.mitro.java8.behaviourparametrization.fruitfactory;

public class Program {

	public static void main(String[] args) {
		FruitFactory fruitFactory = new FruitFactory();
		System.out.println(fruitFactory.create("a").getFruitname());
		System.out.println(fruitFactory.create("o").getFruitname());
		System.out.println(fruitFactory.create("b").getFruitname());

		System.out.println(fruitFactory.create("a").getFruitname());
		System.out.println(fruitFactory.create("o").getFruitname());
		System.out.println(fruitFactory.create("b").getFruitname());
	}
}
