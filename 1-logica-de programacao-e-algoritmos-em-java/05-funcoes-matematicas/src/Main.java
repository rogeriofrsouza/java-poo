
public class Main {

	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double d, e, f;
		
		d = Math.sqrt(x);  // Raiz quadrada
		e = Math.sqrt(y);
		f = Math.sqrt(25.0);
		
		System.out.println("Raiz quadrada de " + x + " = " + d);
		System.out.println("Raiz quadrada de " + y + " = " + e);
		System.out.println("Raiz quadrada de 25 = " + f);
		
		d = Math.pow(x, y);  // Potenciação
		e = Math.pow(x, 2.0);
		f = Math.pow(5.0, 2.0);
		
		System.out.println(x + " elevado a " + y + " = " + d);
		System.out.println(x + " elevado ao quadrado = " + e);
		System.out.println("5 elevado ao quadrado = " + f);
		
		d = Math.abs(y);  // Valor absoluto
		e = Math.abs(z);
		
		System.out.println("Valor absoluto de " + y + " = " + d);
		System.out.println("Valor absoluto de " + z + " = " + e);
		// --------------------------------------------
		
		// Incluindo funções em expressões maiores
		double a = 2.0, b = 1.0, c = 2.0;
		double delta, x1, x2;
		
		delta = Math.pow(b, 2.0) - 4 * a * c;
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
	}

}
