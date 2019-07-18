package hu.mitro.java8.behaviourparametrization.accumulation;

import java.util.function.BiFunction;
import java.util.function.IntPredicate;


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

	public int accum(BiFunction<Integer, Integer, Integer> operation, IntPredicate intPredicate){
		int result = 0;
		for (int i = 0; i < values.length; i++) {
			if (intPredicate.test(values[i])) {
				result = operation.apply(result, values[i]);
			}
		}
		return result;
	}
}
