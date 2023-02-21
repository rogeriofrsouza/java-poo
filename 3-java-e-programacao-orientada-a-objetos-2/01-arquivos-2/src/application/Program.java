package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String path = "D:\\Cursos\\Udemy\\3-java-poo\\repositorio\\3-java-e-programacao-orientada-a-objetos-2\\01-arquivos\\in.txt";
// 		FileReader fr = null;
// 		BufferedReader br = null;
		
		// try-with-resources
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
//			fr = new FileReader(path);  // Estabelece uma sequência de leitura (stream)
//			br = new BufferedReader(fr);  // Instanciado a partir do FileReader, maior abstração
			
			String line = br.readLine();  // Lê uma linha do arquivo, se estiver no final retorna null
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
//		finally {
//			// Fechando as duas streams, pode lançar uma exceção
//			try {
//				if (br != null) {
//					br.close();
//				}
//				
//				if (fr != null) {
//					fr.close();
//				}
//			}
//			catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
	}

}
