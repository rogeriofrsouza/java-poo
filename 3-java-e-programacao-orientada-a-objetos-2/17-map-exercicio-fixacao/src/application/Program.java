package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {

		/*
		 * Na contagem de votos de uma eleição, são gerados vários registros de votação contendo o 
		 * nome do candidato e a quantidade de votos (formato .csv) que ele obteve em uma urna de votação. 
		 * Você deve fazer um programa para ler os registros de votação a partir de um arquivo, e daí 
		 * gerar um relatório consolidado com os totais de cada candidato.
		 */
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new TreeMap<>();  // Garante a ordenação
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int votes = Integer.parseInt(fields[1]);
				
				if (map.containsKey(name)) {
					votes += map.get(name);
				}
				
				map.put(name, votes);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println();
		
		for (String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		
		sc.close();
	}

}
