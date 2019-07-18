package hu.mitro.designpatterns.visitor;

import java.util.Set;


public class SpecialFile extends Item {

	int size;
	Set<Attributes> attributes;

	public SpecialFile(String name, int size, Set<Attributes> attributes) {
		super(name);
		this.size = size;
		this.attributes = attributes;
	}

	@Override
	public String toString() {
		return "---- " + name + " | " + size + " | " + attributes.toString();
	}

	public void accept(Visitor countingVisitor) {
		countingVisitor.visit(this);
	}

}
