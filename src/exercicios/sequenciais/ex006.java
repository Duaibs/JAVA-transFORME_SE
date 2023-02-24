package exercicios.sequenciais;

import java.util.Scanner;

public class ex006 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int num1 = scan.nextInt();
		
		int ante = num1 -1;
		int suce = num1 +1;
		
		System.out.println("O valor digitado foi " + num1 + 
				" \n seu antecessor eh " + ante + 
				"\n e seu sucessor eh " + suce);

	}

}
