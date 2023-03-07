package db;

// Exceção personalizada para acesso a dados
public class DbException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DbException(String msg) {
		super(msg);
	}
	
}
