package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Banco {

	private static final String driver = "org.postgresql.Driver";
	private static final String banco = "dbfarmacia";
	private static final String user = "postgres";
	private static final String password = "1234";
	private static final String conexao = "jdbc:postgresql://localhost:5432/" + banco;

	public static Connection getConnection() {
		try {
			Connection conn = null;
			Class.forName(driver);
			conn = DriverManager.getConnection(conexao, user, password);
			return conn;
		} catch (ClassNotFoundException e) {
			System.out.println("Classe do Driver não foi encontrada.");
			return null;
		} catch (SQLException e) {
			System.out.println("Erro ao obter a Connection.");
			return null;
		}

	}

	public static void closeConnection(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("\nErro ao fechar conexão.");
		}

	}

	public static Statement getStatement(Connection conn) {
		try {
			Statement stmt = conn.createStatement();
			return stmt;

		} catch (SQLException e) {
			System.out.println("\nErro ao obter Statement");
			return null;
		}

	}

	public static void closeStatement(Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			System.out.println("\nErro ao fechar Statement.");
		}

	}

	public static PreparedStatement getPreparedStatement(Connection conn) {
		try {
			PreparedStatement stmt = null;
			return stmt;

		} catch (Exception e) {
			System.out.println("Erro ao obter o PreparedStatement.");
			return null;
		}
	}
	public static void closePreparedStatement(PreparedStatement stmt){
		
		try {
			if (stmt != null){
				stmt.close();
				
			}
			
		} catch (SQLException e) {
			System.out.println("\nErro ao fechar PreparedStatement.");
		}
	}
	public static void closeReultSet(ResultSet resultSet){
		try {
			if(resultSet != null){
				resultSet.close();
			}
		} catch (SQLException e) {
			System.out.println("\nErro ao fechar ResultSet.");
		}
	}

}
