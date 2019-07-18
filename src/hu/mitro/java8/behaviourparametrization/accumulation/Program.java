package hu.mitro.java8.behaviourparametrization.accumulation;

import java.util.function.BiFunction;
import java.util.function.IntPredicate;


public class Program {

	static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Accumulation accumulation = new Accumulation(a);
		AddOperation addOperation = new AddOperation();
		MultiplyOperation multiplyOperation = new MultiplyOperation();

		System.out.println(accumulation.accum(0));
		System.out.println(accumulation.accum(0, addOperation));
		System.out.println(accumulation.accum(10));
		System.out.println(accumulation.accum(10, addOperation));

		System.out.println(accumulation.accum(0, multiplyOperation));
		System.out.println(accumulation.accum(10, multiplyOperation));

		EvenPredicate evenPredicate = new EvenPredicate();
		System.out.println(accumulation.accum(0, addOperation, evenPredicate));

		PositivePredicate positivePredicate = new PositivePredicate();
		System.out.println(accumulation.accum(10, multiplyOperation, positivePredicate));

		// With anonymous classes
		System.out.println(accumulation.accum(0,
				new Operation() {

					@Override
					public int operate(int a, int b) {
						return a - b;
					}
				},
				new Predicate() {

					@Override
					public boolean test(int i) {
						return isPrime(i);
					}
				}));

		// With lambda expressions
		System.out.println(accumulation.accum(0, (x, y) -> x + y, i -> i % 2 == 0));
		System.out.println(accumulation.accum(0, addOperation, evenPredicate));

		// Functional interfaces
		BiFunction<Integer, Integer, Integer> biFunction = (i, j) -> i + j;
		IntPredicate intPredicate = i -> i % 2 == 0;
		System.out.println(accumulation.accum(biFunction, intPredicate));

	}
}
