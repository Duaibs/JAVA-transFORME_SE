package exercicios.sequenciais;

import javax.swing.JOptionPane;

public class ex013 {
	//Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.

	public static void main(String[] args) {
		int cont = 1;
		int cont100 = 0;
		
		do {
			double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um múmero qualquer:"));
				if (numero >= 0 && numero <= 100) {
					cont100 = cont100 +1;
				}
				
				cont = cont +1;
			
		} while (cont <= 20);
		
		JOptionPane.showMessageDialog(null,"Foram digitados " + cont100 + " números entre 0 e 100.");
			
		}

	}


