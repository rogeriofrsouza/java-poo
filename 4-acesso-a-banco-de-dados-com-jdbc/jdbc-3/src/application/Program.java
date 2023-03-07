package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import db.DB;

public class Program {

	public static void main(String[] args) {

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)", 
					Statement.RETURN_GENERATED_KEYS);  // Espera um comando SQL, com placeholders (?)
			
			st.setString(1, "Carl Purple");
			st.setString(2, "carl@gmail.com");
			
			// https://stackoverflow.com/questions/18614836/using-setdate-in-preparedstatement
			st.setDate(3, java.sql.Date.valueOf(LocalDate.parse("22/04/1985", fmt)));
			st.setDouble(4, 3000.0);
			st.setInt(5, 4);
			
			int rowsAffected = st.executeUpdate();
			
			if (rowsAffected > 0) {
				System.out.println("Done! Rows affected: " + rowsAffected);
				
				ResultSet rs = st.getGeneratedKeys();  // Retorna um ou mais valores
				
				while (rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Id = " + id);
				}
			}
			else {
				System.out.println("No rows affected!");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();  // Fechar a conexão por último
		}
	}

}
