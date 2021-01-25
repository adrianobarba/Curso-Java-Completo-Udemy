package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		double media;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Imforme a média: ");
		
		media = entrada.nextDouble();
		
		/*if(media >= 7.0) {
			System.out.println("Aprovado!");   //Se não colocar o par de chaves ele só executa 
			System.out.println("Parabéns!");  // a primeira linha
		}*/
		if(media <= 10 && media >= 7.0) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		}
		
		if(media < 7 && media >= 4.5) {
			System.out.println("Recuperação");	
		}
		
		if(media <= 4 && media >= 0) {
			System.out.println("Reprovado");
		}
	
		entrada.close();
		
	}

}
