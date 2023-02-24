package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "D:\\Cursos\\Udemy\\3-java-poo\\repositorio\\3-java-e-programacao-orientada-a-objetos-2\\01-arquivos-3\\out.txt";
		
		// Bloco try-with-resources
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();  // Quebra de linha
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
