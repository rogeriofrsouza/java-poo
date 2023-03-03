package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

// Classe fechada para alteração -> mudança do filtro
public class ProductService {

	// Receber a condição (predicado) como parâmetro da função
	public double filteredSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;
		
		for (Product p : list) {
			// Teste genérico de qualquer predicado recebido por parâmetro
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		
		return sum;
	}
}
