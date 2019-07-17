package hu.mitro.decorator.strategy;

public class Program {

	public static void main(String[] args) {
		InputChecker inputChecker = new InputChecker(new UpperCaseChecker());
		System.out.println("Is uppercase? " + inputChecker.check("ABCDE"));
		System.out.println("Is uppercase? " + inputChecker.check("ABcDe"));
		StringChecker lowerChecker = new LowerCaseChecker();
		inputChecker.setStringChecker(lowerChecker);
		System.out.println("Is lowercase? " + inputChecker.check("abcde"));
		System.out.println("Is lowercase? " + inputChecker.check("ABcDe"));
		StringChecker digitChecker = new DigitChecker();
		inputChecker.setStringChecker(digitChecker);
		System.out.println("Is digit only? " + inputChecker.check("12345"));
		System.out.println("Is digit only? " + inputChecker.check("12cD5"));
	}
}
