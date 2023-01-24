package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * A lista não aceita tipos primitivos, apenas wrapper classes
		 * <> - símbolo de Generics
		 * Para usar a interface (List) é preciso instanciar uma classe que implementa esta Interface
		 * ArrayList é uma implementação otimizada
		 */
		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");  // Sobrecarga
		
		System.out.println(list.size());
			
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		
		// list.remove("Anna");  // Remove um dado a partir da comparação de um valor
		// list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');  // Função Lambda -> predicado (true or false)
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));  // Não encontrado (-1)
		
		System.out.println("-------------------");
		
		/*
		 *  Lista filtrada com nomes que começam com 'A'
		 *  Tipo stream aceita operações com expressões lambda mas não é compatível com List
		 *  Converter stream de volta para List
		 *  Forma do Java 8 para manter a compatibilidade com o tipo List (antigo) e permitir operações lambda
		 */
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		
		// Retorna o primeiro elemento que começa com 'J' ou null (não encontrou)
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		
		System.out.println(name);
		
	}

}
