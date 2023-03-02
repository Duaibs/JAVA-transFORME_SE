package exercicios.sequenciais;

import javax.swing.JOptionPane;

public class ex009 {
	//Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.

	public static void main(String[] args) {
		int cont = 1;
		int idadezero = 1000000000;
		String nomezero = null;
		
		do {
			String nome = JOptionPane.showInputDialog("Digite o seu nome:"); 
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade, " + nome + "."));
			
		if (idade < idadezero) {
			idadezero = idade;
			nomezero = nome;
		}	
		
		cont = cont +1;	
	} while (cont <=10);
	
		JOptionPane.showMessageDialog(null, "O(A) " + nomezero + " é a pessoa mais nova dos listados (" + idadezero + " anos).");
	}
}
