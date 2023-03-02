package exercicios.sequenciais;

public class ex002 {
	//Escreva um algoritmo que calcule a soma dos números de 1 a 15.

	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		int soma = 0;	
		
		do {
			soma = soma + x + y;
			x = x + 2;
			y = y + 2;
		} while (y <= 15);
	
		System.out.print(soma);
	}

}
