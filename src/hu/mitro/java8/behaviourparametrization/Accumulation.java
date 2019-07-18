package hu.mitro.java8.behaviourparametrization;

public class Accumulation {

	private int[] values;

	public Accumulation(int[] values) {
		this.values = values;
	}

	public int accum(int init) {
		for (int i = 0; i < values.length; i++) {
			init += values[i];
		}
		return init;
	}

	public int accum(int init, Operation operation) {
		for (int i = 0; i < values.length; i++) {
			init = operation.operate(init, values[i]);
		}
		return init;
	}

	public int accum(int init, Operation operation, Predicate predicate) {
		for (int i = 0; i < values.length; i++) {
			if (predicate.test(values[i])) {
				init = operation.operate(init, values[i]);
			}
		}
		return init;
	}
}
