package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		// HashSet: implementação mais rápida, não garante a ordenação
//		Set<String> set = new HashSet<>();
		
		// TreeSet: mais lento, ordena os dados
//		Set<String> set = new TreeSet<>();
		
		// LinkedHashSet: intermediário, mantém a ordem de inserção dos dados
		Set<String> set = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
//		set.removeIf(x -> x.length() >= 3);
//		set.removeIf(x -> x.charAt(0) == 'T');
		
		System.out.println(set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
		}

	}

}
