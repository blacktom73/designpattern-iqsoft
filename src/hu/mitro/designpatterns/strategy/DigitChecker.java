package hu.mitro.designpatterns.strategy;

public class DigitChecker implements StringChecker {

	@Override
	public boolean check(char ch) {
		return Character.isDigit(ch) ? true : false;
	}
}
