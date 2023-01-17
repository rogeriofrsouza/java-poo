import java.util.Locale;
import java.util.Scanner;

public class Main {

	// Função default do entrypoint da aplicação
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 *  1. Operadores bitwise
		 *  Aplicado em: programação de baixo nível, microcontrolador, interface de rede, arduino
		 */
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		// Aplicação comum: verificar bits com uma máscara
		int mask = 0b100000;  // 32 binário
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!\n");
		}
		else {
			System.out.println("6th bit is false!\n");
		}
		// --------------------
		
		/* 
		 * 2. Funções interessantes para String
		 */
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace(\"abc\", \"xy\"): -" + s07 + "-");
		System.out.println("indexOf(\"bc\"): " + i);
		System.out.println("lastIndexOf(\"bc\"): " + j);
		// --------------------
		
		// Operação split
		String s = "potato apple lemon orange";
		
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		String word4 = vect[3];
		
		System.out.printf("%n%s%n%s%n%s%n%s", word1, word2, word3, word4);
		// --------------------
		
		/*
		 * 3. Funções (sintaxe)
		 */
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;  // variável de escopo local
		
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher :" + value);
	}

}
