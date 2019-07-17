package hu.mitro.decorator.strategy;

public class DigitChecker implements StringChecker {

	@Override
	public boolean check(char ch) {
		return Character.isDigit(ch) ? true : false;
	}
}
