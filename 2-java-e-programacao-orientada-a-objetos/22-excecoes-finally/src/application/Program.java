package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		// File file = new File("C:\\temp\\in.txt");
		File file = new File("D:\\Cursos\\Udemy\\3-java-poo\\repositorio\\2-java-e-programacao-orientada-a-objetos\\22-excessoes-finally\\in");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());  // Msg padrão quando o arquivo não é encontrado
		}
		// Bloco de código a ser executado ocorrendo ou não uma exceção
		finally {
			if (sc != null) {
				sc.close();
			}
			
			System.out.println("Finally block executed");
		}

	}

}
