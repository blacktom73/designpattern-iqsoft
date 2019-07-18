package hu.mitro.designpatterns.pattern.extra;

import hu.mitro.designpatterns.pattern.Product;


public class Honey extends Extra {

	public Honey(Product product) {
		super(product);
	}

	@Override
	public double price() {
		return 200 + super.decorated.price();
	}
}
