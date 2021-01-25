package jdbc;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultarPessoas2 {

	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		
			Connection conexao = FabricaConexao.getConexao();
			String sql = "SELECT * FROM pessoas WHERE nome like ?";
			
			System.out.print("Imforme o valor para pesquisa:");
			String valor = entrada.nextLine();
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, "%" + valor + "%");
			ResultSet resultado = stmt.executeQuery();
			
			List<Pessoa> pessoas = new ArrayList<>();
			
			 while(resultado.next()) {
				 int codigo = resultado.getInt("codigo");
				 String nome = resultado.getString("nome");
				 pessoas.add(new Pessoa(codigo, nome));
			 }

			 for (Pessoa p: pessoas)
				 System.out.println(p.getCodigo() + " ==> " + p.getNome());

			stmt.close();
			conexao.close();
			entrada.close();
			
			
				
		}
		
	}

//As informa��es de codigo e senha e acesso est�o em conexao properties pode ser criado um modelo
// conexao properties modelo onde n�o tem a informa��es para ser colocada no git




