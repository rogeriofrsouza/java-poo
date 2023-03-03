package application;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product> {

	// Possui um retorno parecido com o compareTo()
	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
