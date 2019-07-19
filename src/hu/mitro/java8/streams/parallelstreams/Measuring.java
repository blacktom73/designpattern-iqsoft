package hu.mitro.java8.streams.parallelstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;


public class Measuring {

	public static long sum1(long number) {
		long result = 0;
		for (int i = 1; i <= number; i++) {
			result += i;
		}
		return result;
	}

	public static <T, R> long measure(Function<T, R> function, T arg) {
		List<Long> measures = new ArrayList<>();
		long start;

		System.out.println("Results of measuring:");
		for (int i = 0; i < 10; i++) {
			start = System.currentTimeMillis();
			R result = function.apply(arg);
			System.out.println(result);
			measures.add(System.currentTimeMillis() - start);
		}

		return measures.stream().mapToLong(l -> l).min().getAsLong();
	}

	public static long sum2(long number) {
		return Stream.iterate(1L, i -> i + 1)
				.limit(number)
				.reduce(Long::sum).get();
	}

	public static long sum2b(long number) {
		return Stream.iterate(1L, i -> i + 1)
				.limit(number)
				.parallel()
				.reduce(Long::sum).get();
	}
}
