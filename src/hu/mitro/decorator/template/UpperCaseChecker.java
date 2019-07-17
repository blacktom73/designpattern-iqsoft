package hu.mitro.decorator.template;

public class UpperCaseChecker extends CheckerTemplate {

	@Override
	protected boolean primitiveCheck(char ch) {
		return Character.isUpperCase(ch) ? true : false;
	}

}
