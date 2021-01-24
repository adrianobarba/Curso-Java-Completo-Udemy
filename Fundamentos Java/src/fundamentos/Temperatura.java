package fundamentos;

public class Temperatura {

		public static void main(String [] args) {
			//(°F - 32) x 5/9 = °C
			double F = 86;
			double C = (F - 32) * 5/9;
			System.out.println("A temperatura = " + C + "°C");
			
			final double FATOR = 5.0 / 9.0;
			final double AJUSTE = 32;
			
			double fahrenheit = 86;
			double celsius = (fahrenheit - AJUSTE) * FATOR;
			
			System.out.println("O resultado é " + celsius + "°C");
			
			fahrenheit = 0;
			celsius = (fahrenheit - AJUSTE) * FATOR;
			
			System.out.println("O resultado é " + celsius + "°C");
			
		}

	}

