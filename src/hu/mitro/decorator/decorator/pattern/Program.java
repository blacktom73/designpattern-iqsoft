package hu.mitro.decorator.decorator.pattern;

import hu.mitro.decorator.decorator.pattern.drinks.Coffee;
import hu.mitro.decorator.decorator.pattern.extra.Honey;
import hu.mitro.decorator.decorator.pattern.extra.Milk;
import hu.mitro.decorator.decorator.pattern.extra.WhippedCream;


public class Program {

	public static void main(String[] args) {
		Product cofeeWithMilkAndHoney = new WhippedCream(new Honey(new Milk(new Coffee())));
		System.out.println(cofeeWithMilkAndHoney.price());
	}
}
