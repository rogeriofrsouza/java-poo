package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		/*
		 * List<Object> não é o supertipo de qualquer tipo de lista
		 * List<?> -> Supertipo de lista (tipo curinga)
		 */
		List<?> myObjs = new ArrayList<>();
		List<Integer> myNumbers = new ArrayList<>();
		myObjs = myNumbers;
		
		Object obj;
		Integer x = 10;
		obj = x;
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}
	
	// Imprime qualquer tipo de lista
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
		
//		list.add(3);  // Não é possível adicionar dados a uma coleção de tipo curinga  
	}

}
