package exercicios.condicionais;

import javax.swing.JOptionPane;

public class ex005 {
	// Faça um algoritmo que leia um determinado ano e mostre se ele é ou não BISSEXTO.

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Vamos descobrir se determinado ano é ou não é bissexto!");
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um ano qualquer:"));
		
		if (ano %4 == 0) {
			JOptionPane.showMessageDialog(null, "Sim, o ano " + ano + " é bissexto!");
		
		} else {
			JOptionPane.showMessageDialog(null, "Não, o ano " + ano + " não é bissexto");	
			
			
		}
		
 
	}

}
