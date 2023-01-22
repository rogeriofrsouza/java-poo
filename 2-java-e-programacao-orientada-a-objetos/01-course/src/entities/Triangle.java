package entities;  // Pacote da classe

public class Triangle {

	// Atributos da classe
	// O prefixo public permite o uso do atributo/método em outros arquivos 
	public double a;
	public double b;
	public double c;
	
	// Reaproveitamento e delegação: cada classe é responsável por si mesma (coesão)
	public double area() {
		double p = (a + b + c) / 2.0;
		
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
