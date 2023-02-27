package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		
		copy(myDoubles, myObjs);
		printList(myObjs);
	}
	
	/*
	 * Lista de origem -> qualquer tipo numérico (covariância)
	 * Lista de destino -> qualquer tipo super de Number (contravariância)
	 */
	public static void copy(List<? extends Number> source, List<? super Number> target) {
		for (Number number : source) {
			target.add(number);
		}
	}
	
	// Método genérico para imprimir uma lista qualquer
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		
		System.out.println();
	}

}
