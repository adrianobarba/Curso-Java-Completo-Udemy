package controle;

public class Continue {
	
	public static void main(String[] agrs) {
		
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			
			System.out.println(i);
		}
	}

}
