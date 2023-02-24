package sequencias.basicas;
import javax.swing.JOptionPane;
public class ex002 {
//) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog(null, "Por favor, digite o seu nome:");
		JOptionPane.showMessageDialog(null, "Olá " + nome + " é um prazer conhecê-lo(a)");

	}

}
