package sequencias.basicas;
import javax.swing.JOptionPane;
public class ex003 {
//Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem.
	
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog(null, "Qual é o seu nome?");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("E quanto você ganha atualmente:?"));
		
		JOptionPane.showMessageDialog(null, "O(A) funcionário(a) " + nome + " recebe atualmente o salário no valor de R$" + salario);
		
		

	}

}
