package exercicios.condicionais;

import javax.swing.JOptionPane;

public class ex004 {
	//Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou ÍMPAR.

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Vamos descobrir se determinado número é par ou ímpar!");
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro: "));
		if(numero %2 == 0) {
			JOptionPane.showMessageDialog(null, "O número " + numero + " é par!");
		}
			else {
				JOptionPane.showMessageDialog(null , "O número " + numero + " é impar!");
			}
		}
		
		
	}
