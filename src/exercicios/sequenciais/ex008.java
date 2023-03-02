package exercicios.sequenciais;

import javax.swing.JOptionPane;

public class ex008 {
	//Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.

	public static void main(String[] args) {
		int cont =1;
		int cont18 = 0;
		
		do {
			
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual é a sua idade:"));
			cont =  cont +1;
			if  (idade >=18) {
				cont18 = cont18 + 1;
				
			}
		
		} while (cont <=20);

		JOptionPane.showMessageDialog(null, "Existem " + cont18 + " pessoas maiores de idade!");
	}

}
