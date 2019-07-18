package hu.mitro.java8.behaviourparametrization.accumulation;

public class AddOperation implements Operation {

	@Override
	public int operate(int a, int b) {
		return a + b;
	}
}
