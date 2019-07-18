package hu.mitro.designpatterns.decorator.pattern.extra;

import hu.mitro.designpatterns.decorator.pattern.Product;


public class Milk extends Extra {

	public Milk(Product product) {
		super(product);
	}

	@Override
	public double price() {
		return 150 + super.decorated.price();
	}
}
