package hu.mitro.designpatterns.template;

public class UpperCaseChecker extends CheckerTemplate {

	@Override
	protected boolean primitiveCheck(char ch) {
		return Character.isUpperCase(ch) ? true : false;
	}

}
