package hu.mitro.java8.behaviourparametrization.accumulation;

public class EvenPredicate implements Predicate {

	@Override
	public boolean test(int i) {
		return i % 2 == 0;
	}
}
