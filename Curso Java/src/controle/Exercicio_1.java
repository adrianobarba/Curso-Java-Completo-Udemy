package controle;

import java.util.Scanner;

public class Exercicio_1 {

	// Crie uma função que recebe dois números e imprime a soma
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite um número: ");
		a = entrada.nextInt();
		
		System.out.println("Digite outro número: ");
		b = entrada.nextInt();
		
		int soma = a + b;
		
		System.out.println("O resultado é: " + soma);
		
		entrada.close();
		
		
	}
}
