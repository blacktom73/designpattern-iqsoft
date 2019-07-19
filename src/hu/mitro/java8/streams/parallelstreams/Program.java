package hu.mitro.java8.streams.parallelstreams;

public class Program {

	public static void main(String[] args) {
		System.out.print("Result in oldschool way: " + Measuring.sum1(30000000));
		System.out.println();
		long ret = Measuring.measure(Program::sum, 30000000L);
		System.out.println("Minimum: " + ret);

		System.out.println(Measuring.sum2(30000000L));

	}

	public static long sum(long number) {
		long result = 0;
		for (int i = 1; i <= number; i++) {
			result += i;
		}
		return result;
	}

}
