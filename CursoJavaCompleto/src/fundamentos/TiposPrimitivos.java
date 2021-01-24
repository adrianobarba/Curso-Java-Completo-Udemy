package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações do funcionario
		
		//Tipos de números inteiros
		byte anosDeEmpresa = 23;// valor literal é tudo que vc seta direto no codigo
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;//separando com anderline para facilitar leitura
		//tem que colocar o L no final para que o programa entenda que é long
		
		//Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; //true
		
		//Tipo caractere
		char status = 'A'; // ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);//se criar uma variavel e não usar e gerado uma advertencia
		
		//Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + "ganha ->" + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}

}	

