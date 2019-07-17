package hu.mitro.decorator.visitor;

public class CountingVisitor implements Visitor {

	@Override
	public void visit(Directory directory) {
		int coutRF = 0;
		int coutSF = 0;
		for (Item item : directory.subDirectories) {
			if (item instanceof RegularFile) {
				coutRF++;
			} else
				if (item instanceof SpecialFile) {
					coutSF++;
				}
		}
		System.out.println("Directory " + directory.name + " has "
				+ coutRF + " regular files, " + coutSF + " special files.");
	}
}
