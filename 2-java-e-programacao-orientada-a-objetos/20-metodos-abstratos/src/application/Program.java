package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Inferir o tipo genérico na coleção para utilizar o Polimorfismo
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		System.out.println();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data");
			
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if (ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				
				System.out.print("Heigth: ");
				double heigth = sc.nextDouble();
				
				list.add(new Rectangle(color, width, heigth));
			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		
		// O compilador não sabe qual o tipo específico de cada figura da lista
		for (Shape shape : list) {
			System.out.printf("%.2f%n", shape.area());
		}
		
		sc.close();

	}

}
