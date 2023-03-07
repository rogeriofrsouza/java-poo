package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

	private static Connection conn = null;  // Objeto de conexão do JDBC
	
	public static Connection getConnection() {
		if (conn == null) {
			try {
				Properties props = loadProperties();
				
				String url = props.getProperty("dburl");
				conn = DriverManager.getConnection(url, props);  // Estabelece a conexão com o banco (instância de Connection)
			}
			catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
		
		return conn;
	}
	
	public static void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			}
			catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	
	private static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("db.properties")) {
			Properties props = new Properties();
			props.load(fs);  // Leitura e armazenamento dos dados do arquivo
			
			return props;
		}
		catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}
	
}
