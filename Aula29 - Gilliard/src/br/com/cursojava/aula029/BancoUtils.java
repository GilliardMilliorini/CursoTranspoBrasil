package br.com.cursojava.aula029;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoUtils {

	private static final String USER = "postgres";
	private static final String PASSWORD = "admin";
	private static final String URL = "jdbc:postgresql://localhost:5432/curso";
	private static Connection connection;
	
	
//	static{
//		
//		try {
//			Class.forName("org.postgresql.driver");
//		} catch (ClassNotFoundException e) {
//			System.out.println("N�o foi possivel carregar o driver do banco de dados");			
//			e.printStackTrace();
//		}		// comando para realizar o carregamento manual do banco de dados
//		
//	}
	
	
	public static Connection getConnection() throws SQLException{
		if (connection == null || connection.isClosed()){
			try{
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			} catch (SQLException e) {
				System.out.println("N�o ffoi possivel criar uma conex�o com o banco de dados");
				throw e;
			}
		}
		return connection;
	}


	public static void main(String[] args) throws SQLException {
		Connection con = getConnection();
		if(con != null){
			System.out.println("Teste de conex�o realizado com sucesso");
			con.close();
		} else {
			System.out.println("N�o foi possivel realizar a conex�o com o banco de dados [:(]");
		}
	}
	
}
