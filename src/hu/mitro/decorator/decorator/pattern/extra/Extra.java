package hu.mitro.decorator.decorator.pattern.extra;

import hu.mitro.decorator.decorator.pattern.Product;


public abstract class Extra implements Product {

	Product decorated;



	public Extra(Product product){
		this.decorated = product;
	}

	public double price() {
		return decorated.price();
	}
}
