
public class Main {

	public static void main(String[] args) {
		
		int x, y;
		
		// Comandos de atribuição (processamento de dados)
		x = 5;
		y = 2 * x;
		
		System.out.printf("Exemplo 1: %d %d%n", x, y);
		//---------------------------------
		
		int i;
		double j;
		
		i = 5;
		j = 2 * i;
		
		System.out.printf("Exemplo 2: %d %f%n", i, j);
		//---------------------------------
		
		double b, B, h, area;
		
		// Boa prática: sempre indique o tipo do número, se a expressão for de ponto flutuante
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		System.out.printf("Exemplo 3: %f%n", area);
		
		/*  	
		 * float b, B, h, area;
		 * 
		 * b = 6f;
		 * B = 8f;
		 * h = 5f;
		 * 
		 * area = (b + B) / 2f * h;
		 * System.out.printf("Área do trapézio: %f\n", area);
		 * --------------------------------
		 */
		
		int c, d;
		double resultado;
		
		c = 5;
		d = 2;
		
		resultado = (double) c / d;  // Operador de casting (conversão explícita)
		System.out.printf("Exemplo 4: %f%n", resultado);
		//---------------------------------
		
		double r;
		int s;
		
		r = 5.0;
		s = (int) r;
		
		System.out.printf("Exemplo 5: %d", s);
	}
	
}
