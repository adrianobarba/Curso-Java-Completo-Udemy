package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		double media;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Imforme a m�dia: ");
		
		media = entrada.nextDouble();
		
		/*if(media >= 7.0) {
			System.out.println("Aprovado!");   //Se n�o colocar o par de chaves ele s� executa 
			System.out.println("Parab�ns!");  // a primeira linha
		}*/
		if(media <= 10 && media >= 7.0) {
			System.out.println("Aprovado!");
			System.out.println("Parab�ns!");
		}
		
		if(media < 7 && media >= 4.5) {
			System.out.println("Recupera��o");	
		}
		
		if(media <= 4 && media >= 0) {
			System.out.println("Reprovado");
		}
	
		entrada.close();
		
	}

}
