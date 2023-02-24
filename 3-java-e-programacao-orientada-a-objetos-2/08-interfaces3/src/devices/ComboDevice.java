package devices;

// Uma classe pode implementar mais de uma interface
public class ComboDevice extends Device implements Printer, Scanner {

	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}
	
	/*
	 * A interface obriga a implementação dos métodos
	 * Esta obrigação elimina a ambiguidade do problema do diamante
	 */
	@Override
	public void processDoc(String doc) {
		System.out.println("Combo processing: " + doc);
	}

	@Override
	public void print(String doc) {
		System.out.println("Combo printing: " + doc);
	}

	@Override
	public String scan() {
		return "Combo scan result";
	}

}
