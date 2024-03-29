package hu.mitro.designpatterns.template;

public class LowerCaseChecker extends CheckerTemplate {

	@Override
	protected boolean primitiveCheck(char ch) {
		return Character.isLowerCase(ch) ? true : false;
	}

}
