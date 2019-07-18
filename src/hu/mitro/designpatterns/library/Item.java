package hu.mitro.designpatterns.library;

import java.util.HashSet;
import java.util.Set;


public interface Item {

	Set<Item> items = new HashSet<>();

	void info();
}
