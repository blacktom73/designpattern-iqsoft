package hu.mitro.designpatterns.pattern;

import hu.mitro.designpatterns.pattern.drinks.Coffee;
import hu.mitro.designpatterns.pattern.extra.Honey;
import hu.mitro.designpatterns.pattern.extra.Milk;
import hu.mitro.designpatterns.pattern.extra.WhippedCream;


public class Program {

	public static void main(String[] args) {
		Product cofeeWithMilkAndHoney = new WhippedCream(new Honey(new Milk(new Coffee())));
		System.out.println(cofeeWithMilkAndHoney.price());
	}
}
