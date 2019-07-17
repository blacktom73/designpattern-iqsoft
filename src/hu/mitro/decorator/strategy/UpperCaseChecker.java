package hu.mitro.decorator.strategy;

public class UpperCaseChecker implements StringChecker {

	@Override
	public boolean check(char ch) {
		return Character.isUpperCase(ch) ? true : false;
	}
}
