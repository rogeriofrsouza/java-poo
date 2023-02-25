package services;

import java.util.ArrayList;
import java.util.List;

// Parametrizada com o tipo T (nome qualquer), garante o reuso e type safety
public class PrintService<T> {

	private List<T> list = new ArrayList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		
		return list.get(0);
	}
	
	public void print() {
//		System.out.println(Arrays.toString(list.toArray()));
		
		System.out.print("[");
		
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
			
			for (int i = 1; i < list.size(); i++) {
				System.out.print(", " + list.get(i));
			}
		}
		
		System.out.println("]");
	}
	
}
