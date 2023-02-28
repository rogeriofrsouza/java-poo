package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();

		addStudents(a, 'A', sc);
		addStudents(b, 'B', sc);
		addStudents(c, 'C', sc);
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total students: " + total.size());
		
		sc.close();
	}
	
	public static void addStudents(Set<Integer> set, char c, Scanner sc) {
		
		System.out.print("How many students for course " + c + "? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			set.add(sc.nextInt());
		}
	}

}
