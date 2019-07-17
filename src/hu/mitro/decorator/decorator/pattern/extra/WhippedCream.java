package hu.mitro.decorator.decorator.pattern.extra;

import hu.mitro.decorator.decorator.pattern.Product;


public class WhippedCream extends Extra {

	public WhippedCream(Product product) {
		super(product);
	}

	@Override
	public double price() {
		return 150 + super.decorated.price();
	}
}
