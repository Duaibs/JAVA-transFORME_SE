package exercicios.sequenciais;

import javax.swing.JOptionPane;

public class ex004 {
	//Leia o nome do usuário e um número N. Escreva o nome dele na tela N vezes.

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		int limite = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro, \n seu nome será repetido nesse número de vezes:"));
		int cont = 1;
		
		do {
			System.out.println(nome + ("(" + cont + ")"));
			cont = cont + 1;
		} while (cont <= limite);
	}

}
