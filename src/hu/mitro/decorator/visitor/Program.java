package hu.mitro.decorator.visitor;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;


public class Program {

	public static void main(String[] args) {
		Directory root = new Directory("root");
		root.add(new RegularFile("regular-file1", 10));
		root.add(new RegularFile("regular-file2", 20));
		Directory directory1 = new Directory("Directory1");
		root.add(directory1);
		directory1.add(new SpecialFile("special-file1", 100,
				Collections.unmodifiableSet(new HashSet<>(Arrays.asList(Attributes.ARCHIVE, Attributes.READ_ONLY)))));
		directory1.add(new SpecialFile("special-file2", 200,
				Collections.unmodifiableSet(new HashSet<>(Arrays.asList(Attributes.READ_ONLY, Attributes.HIDDEN)))));

		System.out.println(root);

		root.accept(new CountingVisitor());
		root.accept(new SummingVisitor());

		directory1.accept(new CountingVisitor());
		directory1.accept(new SummingVisitor());
	}
}
