package hu.mitro.designpatterns.strategy;

public class InputChecker {

	StringChecker stringChecker;

	public InputChecker(StringChecker stringChecker) {
		this.stringChecker = stringChecker;
	}

	public void setStringChecker(StringChecker stringChecker) {
		this.stringChecker = stringChecker;
	}

	public boolean check(String str) {
		char[] chars = str.toCharArray();
		boolean result = true;
		int index = 0;
		while (result != false && index < chars.length){
			result = stringChecker.check(chars[index]);
			index++;
		}
		return result == true ? true : false;
	}
}
