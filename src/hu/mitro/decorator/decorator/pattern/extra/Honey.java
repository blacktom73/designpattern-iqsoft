package hu.mitro.decorator.decorator.pattern.extra;

import hu.mitro.decorator.decorator.pattern.Product;


public class Honey extends Extra {

	public Honey(Product product) {
		super(product);
	}

	@Override
	public double price() {
		return 200 + super.decorated.price();
	}
}
