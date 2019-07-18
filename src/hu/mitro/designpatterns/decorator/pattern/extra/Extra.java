package hu.mitro.designpatterns.decorator.pattern.extra;

import hu.mitro.designpatterns.decorator.pattern.Product;


public abstract class Extra implements Product {

	Product decorated;



	public Extra(Product product){
		this.decorated = product;
	}

	public double price() {
		return decorated.price();
	}
}
