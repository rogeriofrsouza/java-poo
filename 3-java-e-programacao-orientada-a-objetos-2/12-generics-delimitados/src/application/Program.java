package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		String path = "D:\\Cursos\\Udemy\\3-java-poo\\repositorio\\3-java-e-programacao-orientada-a-objetos-2\\12-generics-delimitados\\in.txt";
		List<Product> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String productCsv = br.readLine();
			
			while (productCsv != null) {
				String[] fields = productCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				
				list.add(new Product(name, price));
				productCsv = br.readLine();
			}
			
			Product x = CalculationService.max(list);
			System.out.println("Most expansive: ");
			System.out.println(x);
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
