package hu.mitro.designpatterns.template;

public class DigitChecker extends CheckerTemplate {

	@Override
	protected boolean primitiveCheck(char ch) {
		return Character.isDigit(ch) ? true : false;
	}

}
