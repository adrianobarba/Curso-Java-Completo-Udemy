package controle;

import java.util.Scanner;

public class Exercicio_1 {

	// Crie uma fun��o que recebe dois n�meros e imprime a soma
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite um n�mero: ");
		a = entrada.nextInt();
		
		System.out.println("Digite outro n�mero: ");
		b = entrada.nextInt();
		
		int soma = a + b;
		
		System.out.println("O resultado �: " + soma);
		
		entrada.close();
		
		
	}
}
