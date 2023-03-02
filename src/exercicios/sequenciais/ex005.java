package exercicios.sequenciais;

import javax.swing.JOptionPane;

public class ex005 {
//Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.
	public static void main(String[] args) {
		int cont = 1;
		int soma = 0;
		
		
		do {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("A somatória está em " + soma + ". Digite um número à nossa somatória"));	
		soma = soma + numero;
		cont = cont + 1;

		} while (cont <= 10);

		JOptionPane.showMessageDialog(null, "A somatória ficou em " + soma + ".");
	}

}
