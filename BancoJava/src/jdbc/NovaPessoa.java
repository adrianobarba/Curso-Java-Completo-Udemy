package jdbc;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class NovaPessoa {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Imforme o nome: ");
		String nome = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
			
		//String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)"; 
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		//stmt.setString(1, nome); aqui coloco o codigo 100 e o próximo incremento e 101.
		//stmt.setString(2, 100); ele segue a sequencia do ultimo 
		 stmt.setString(1, nome);
		 
		 stmt.execute();
		 
		System.out.println("Pessoa incluida com sucesso!");
		entrada.close();
			
			
		}
	}



