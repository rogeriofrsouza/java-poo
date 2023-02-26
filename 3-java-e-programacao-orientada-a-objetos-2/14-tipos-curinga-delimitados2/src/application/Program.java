package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		/*
		 * Princípio get/put - covariância
		 * 
		 * get - OK
		 * put - ERROR
		 */
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;  // Atribuindo uma lista específica para um tipo mais genérico
		
		Number x = list.get(0);
		
//		list.add(20);
		// --------------------------------
		
		/*
		 * Princípio get/put - contravariância
		 * 
		 * get - ERROR
		 * put - OK
		 */
		List<Object> myObjs = new ArrayList<>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		// Lista de Number ou qualquer supertipo de Number
		List<? super Number> myNums = myObjs;
		
		// Adicionar qualquer tipo de Number ou Object
		myNums.add(10);
		myNums.add(3.14);
		
//		Number x = myNums.get(0);
	}

}
