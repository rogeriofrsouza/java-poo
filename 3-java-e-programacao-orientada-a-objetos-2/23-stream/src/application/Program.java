package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		// 1. Stream a partir de uma coleção
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		
		System.out.println(Arrays.toString(st1.toArray()));  // Método terminal de stream
		
		// 2. Stream a partir do Stream.of()
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		
		System.out.println(Arrays.toString(st2.toArray()));
		
		// 3. Stream a partir de uma função de iteração (geração)
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);  // Stream potencialmente infinita
		
		System.out.println(Arrays.toString(st3.limit(10).toArray()));  // limit: função short-circuit e intermediária
		
		// 4. Sequência de Fibonacci
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);
		
		System.out.println(Arrays.toString(st4.limit(20).toArray()));
	}

}
