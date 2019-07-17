package hu.mitro.decorator.strategy;

public class LowerCaseChecker implements StringChecker {

	@Override
	public boolean check(char ch) {
		return Character.isLowerCase(ch) ? true : false;
	}
}
