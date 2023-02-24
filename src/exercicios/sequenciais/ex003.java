package exercicios.sequenciais;

import javax.swing.JOptionPane;

public class ex003 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salário?"));
	
		JOptionPane.showMessageDialog(null, "Olá " + nome + " o salário que você digitou foi R$" + salario);

	}

}
