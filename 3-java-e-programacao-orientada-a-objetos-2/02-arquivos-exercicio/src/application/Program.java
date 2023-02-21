package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler o caminho de um arquivo .csv contendo os dados de itens vendidos. 
		 * Cada item possui um nome, preço unitário e quantidade, separados por vírgula. Você deve 
		 * gerar um novo arquivo chamado "summary.csv", localizado em uma subpasta chamada "out" a partir 
		 * da pasta original do arquivo de origem, contendo apenas o nome e o valor total para 
		 * aquele item (preço unitário multiplicado pela quantidade).
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		List<Product> products = new ArrayList<>();
		
		// Lendo dados de produtos do arquivo "in.csv"
		try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
			String line = br.readLine();
			
			while (line != null) {
				String[] values = line.split(",");
				
				String name = values[0];
				double price = Double.parseDouble(values[1]);
				int quantity = Integer.parseInt(values[2]);
				
				products.add(new Product(name, price, quantity));
				line = br.readLine();
			}
			
			strPath = new File(strPath).getParent() + "\\out";
			boolean success = new File(strPath).mkdir();
			
			if (success) {
				strPath += "\\summary.csv";
			}
			
			// Escrevendo dados no arquivo "summary.csv" que será criado
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(strPath))) {
				for (Product prod : products) {
					bw.write(prod.getName() + "," + String.format("%.2f", prod.total()));
					bw.newLine();
				}
			}
			catch(IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
		}
		catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

		System.out.println();
		System.out.println("Done!");
		
		sc.close();

	}

}
