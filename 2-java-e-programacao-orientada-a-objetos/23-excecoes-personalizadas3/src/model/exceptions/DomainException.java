package model.exceptions;

/*
 * Exceção personalizada
 *  
 * Exception: compilador te obriga a fazer o tratamento da exceção
 * RuntimeException: compilador não te obriga a realizar o tratamento
 */
public class DomainException extends RuntimeException {

	// Objetos de classes serializable podem ser convertidos para bytes e trafegados em redes, gravados em arquivos, etc
	private static final long serialVersionUID = 1L;  // Valor default de versão

	public DomainException(String msg) {
		super(msg);
	}
	
}
