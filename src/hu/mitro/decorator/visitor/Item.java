package hu.mitro.decorator.visitor;

public abstract class Item {

	String name;

	public Item(String name) {
		this.name = name;
	}

	public abstract void accept(Visitor visitor);

}
