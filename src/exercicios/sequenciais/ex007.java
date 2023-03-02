package exercicios.sequenciais;

import javax.swing.JOptionPane;

public class ex007 {
	//Leia a idade de 20 pessoas e exiba a média das idades.

	public static void main(String[] args) {
		int cont = 1;
		double soma = 0;
		
		
		do {
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Vamos tirar a média  da idade de 20 pessoas. Você é a " + cont + "ª pessoa. \n Qual é a sua idade?"));	
		soma = soma + numero;
		cont = cont + 1;

		} while (cont <= 20);
		
		double media = soma/20;

		JOptionPane.showMessageDialog(null, "A media das idades é " + media + ".");
	}

}
