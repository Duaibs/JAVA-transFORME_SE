package exercicios.sequenciais;

import javax.swing.JOptionPane;

public class ex003 {
	//Leia o nome do usuário e escreva o nome dele na tela 10 vezes.

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		int cont = 1;
		
		do {
			System.out.println(nome);
			cont = cont + 1;
		} while (cont <= 10);
	}

}
