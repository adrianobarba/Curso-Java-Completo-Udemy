package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CriarBanco {

		
	public static void main(String[] args) throws SQLException {
			
		String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		String usuario = "root";
		String senha = "12345";
			
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
			
			
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE  IF NOT EXISTS curso_java");
		
		System.out.println("Banco criado com sucesso!");
			
			conexao.close();
	}

}


