package hu.mitro.designpatterns.decorator.pattern.extra;

import hu.mitro.designpatterns.decorator.pattern.Product;


public class WhippedCream extends Extra {

	public WhippedCream(Product product) {
		super(product);
	}

	@Override
	public double price() {
		return 150 + super.decorated.price();
	}
}
