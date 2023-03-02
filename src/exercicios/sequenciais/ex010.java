package exercicios.sequenciais;
import javax.swing.JOptionPane;
public class ex010 {
	//Crie um algoritmo leia um número do usuário e exiba a sua tabuada de multiplicação.

	public static void main(String[] args) {

		int cont = 1;
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número que gostaria de ver a sua tabuada:"));
		
		do {
			System.out.println(numero + " X " + cont + " = " + (numero*cont));
			cont = cont +1;
			
		} while (cont <=10);
		
		

	}

}
