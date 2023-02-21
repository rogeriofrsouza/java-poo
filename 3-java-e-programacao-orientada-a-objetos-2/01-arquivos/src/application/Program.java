package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * \ -> prefixo de caracteres especiais (\n, \t, ...)
		 * \\ -> indica uma barra invertida
		 * 
		 * File encapsula todo o processo de acesso ao arquivo e seu caminho
		 */
		File file = new File("D:\\Cursos\\Udemy\\3-java-poo\\repositorio\\3-java-e-programacao-orientada-a-objetos-2\\01-arquivos\\in.txt");
		Scanner sc = null;
		
		// Abertura do arquivo pode gerar uma exceção
		try {
			sc = new Scanner(file);
			
			// Testando se ainda existe uma nova linha no arquivo
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());  // Lê a linha e faz o prinln
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		// Colocar o fechamento do recurso no bloco finally
		finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
