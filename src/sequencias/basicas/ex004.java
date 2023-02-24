package sequencias.basicas;

import javax.swing.JOptionPane;

public class ex004 {
//Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório entre eles.
	public static void main(String[] args) {
	int nume1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro"));	
	int nume2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro número inteiro"));
	int soma = nume1 + nume2;
	
	JOptionPane.showMessageDialog(null, "A soma entre os números " + nume1 + " e " + nume2 + "é igual a: " + soma);
	}

}
