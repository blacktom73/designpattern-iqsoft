package hu.mitro.java8.behaviourparametrization.accumulation;

public class PositivePredicate implements Predicate {

	@Override
	public boolean test(int i) {
		return i >= 0;
	}
}
