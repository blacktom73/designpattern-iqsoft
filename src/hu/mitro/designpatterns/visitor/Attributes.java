package hu.mitro.designpatterns.visitor;

public enum Attributes {
	ARCHIVE("archive"),
	READ_ONLY("read-only"),
	HIDDEN("hidden");

	String name;

	Attributes(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
