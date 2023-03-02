package exercicios.sequenciais;

import javax.swing.JOptionPane;

public class ex006 {
	//Leia a idade de 20 pessoas e exiba a soma das idades.

	public static void main(String[] args) {
		int cont = 1;
		int soma = 0;
		
		
		do {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Vamos somar a idade de 20 pessoas. Você é a " + cont + "ª pessoa. \n Qual é a sua idade?"));	
		soma = soma + numero;
		cont = cont + 1;

		} while (cont <= 20);

		JOptionPane.showMessageDialog(null, "A somatória das idades é " + soma + ".");
	}

}
