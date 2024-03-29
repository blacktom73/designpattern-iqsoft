package hu.mitro.designpatterns.singleton;

public class Singleton {

	private static Singleton onlyInstance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (onlyInstance == null) {
			onlyInstance = new Singleton();
		}
		return onlyInstance;
	}
}
