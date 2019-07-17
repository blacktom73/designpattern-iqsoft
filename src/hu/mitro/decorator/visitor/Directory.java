package hu.mitro.decorator.visitor;

import java.util.HashSet;
import java.util.Set;


public class Directory extends Item {

	Set<Item> subDirectories;

	public Directory(String name) {
		super(name);
		subDirectories = new HashSet<>();
	}

	public void add(Item item) {
		subDirectories.add(item);
	}

	public void remove(Item item) {
		subDirectories.remove(item);
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("---- " + name + "\n");
		for (Item item : subDirectories) {
			if (item instanceof Directory) {
				stringBuilder.append("\t" + item.toString() + "\n");
			} else {
				stringBuilder.append("\t" + item.toString() + "\n");
			}
		}
		return stringBuilder.toString();
	}

	public void accept(Visitor countingVisitor) {
		countingVisitor.visit(this);
		subDirectories.forEach(item -> item.accept(countingVisitor));
	}

}
