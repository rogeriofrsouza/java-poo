package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		String path = "D:\\Cursos\\Udemy\\3-java-poo\\repositorio\\3-java-e-programacao-orientada-a-objetos-2\\09-interface-comparable\\in.txt";
		List<Employee> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeCsv = br.readLine();
			
			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				String name = fields[0];
				double salary = Double.parseDouble(fields[1]);
				
				list.add(new Employee(name, salary));
				employeeCsv = br.readLine();
			}
			
			Collections.sort(list);
			
			for (Employee emp : list) {
				System.out.println(emp);
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
