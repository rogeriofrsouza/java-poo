package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);  // Caminho de uma pasta ou arquivo
		
		File[] folders = path.listFiles(File::isDirectory);  // Reference methods: função como argumento de uma função
		
		System.out.println();
		System.out.println("FOLDERS:");
		
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		
		System.out.println();
		System.out.println("FILES:");
		
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		
		System.out.println();
		System.out.println("Directory created succesfully: " + success);
		
		sc.close();

	}

}
