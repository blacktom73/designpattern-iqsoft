package hu.mitro.java8.streams.parallelstreams;

import java.util.stream.LongStream;


public class MySum {

	private long sum = 0;

	public long add(long number) {
		MySum mySum = LongStream.rangeClosed(1L, number).forEach(Program::sum);
		return mySum.sum;
	}

}
