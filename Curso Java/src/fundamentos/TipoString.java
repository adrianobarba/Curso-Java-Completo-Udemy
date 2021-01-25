package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("bos"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Adriano";
		var sobrenome = "Barbosa";
		var idade = 40;
		var salario = 12345.987;
		
		
		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: "
				+ sobrenome + "\nIdade: " + idade +
				"\nSalario: " + salario + "\n\n";
		
		System.out.println(maisUmaFrase);
		
		
		System.out.println("Nome: " + nome + "\nSobrenome: "
				+ sobrenome + "\nIdade: " + idade +
				"\nSalario: " + salario + "\n\n");
		
		System.out.printf("O senhor 5s 5s tem %d anos e ganha R$%.2f.", 
				nome, sobrenome, idade, salario);
		
		String frase = String.format("O senhor 5s 5s tem %d anos e ganha R$%.2f.", 
				nome, sobrenome, idade, salario);
		System.out.println(frase);	
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 8));
		
		
	}
}