package hu.mitro.designpatterns.template;

public abstract class CheckerTemplate {

	boolean result = true;

	public final void stringCheck(String str) {
		welcome();
		check(str);
		showResult();
	}

	protected void welcome() {
		System.out.println("We are checking a string ...");
	}

	protected boolean check(String str){
		char[] chars = str.toCharArray();
		int index = 0;
		while (result != false && index < chars.length){
			result = primitiveCheck(chars[index]);
			index++;
		}
		return result == true ? true : false;
	}

	protected abstract boolean primitiveCheck(char ch);

	protected void showResult() {
		System.out.println("The result: " + result);
	}

}
