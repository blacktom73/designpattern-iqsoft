package hu.mitro.decorator.pattern;

import hu.mitro.decorator.pattern.drinks.Coffee;
import hu.mitro.decorator.pattern.extra.Honey;
import hu.mitro.decorator.pattern.extra.Milk;
import hu.mitro.decorator.pattern.extra.WhippedCream;


public class Program {

	public static void main(String[] args) {
		Product cofeeWithMilkAndHoney = new WhippedCream(new Honey(new Milk(new Coffee())));
		System.out.println(cofeeWithMilkAndHoney.price());
	}
}
