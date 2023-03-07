package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;  // Comando SQL
		ResultSet rs = null;  // Resultado da consulta SQL
		
		// Operações de acesso ao banco ou qualquer outro recurso externo, podem gerar exceções
		try {
			conn = DB.getConnection();
			
			st = conn.createStatement();  // Instanciando o objeto Statement
			rs = st.executeQuery("SELECT * FROM department");
			
			// Percorre o ResultSet e imprime valores
			while (rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		// Fechando manualmente os recursos externos, não controlados pela JVM
		finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
