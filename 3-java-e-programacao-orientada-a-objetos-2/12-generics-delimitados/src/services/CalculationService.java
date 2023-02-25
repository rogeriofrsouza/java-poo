package services;

import java.util.List;

public class CalculationService {

	/*
	 * Parametrizando o método com um tipo T genérico
	 * O método trabalha com qualquer tipo T ou sua superclasse desde que T seja qualquer subtipo de Comparable<T>
	 */
	public static <T extends Comparable<? super T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		
		T max = list.get(0);
		
		for (T item : list) {
			// Especificar que o tipo T é um tipo Comparable
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		
		return max;
	}
	
}
