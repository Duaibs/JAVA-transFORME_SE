package sequencias.basicas;
import javax.swing.JOptionPane;
public class ex013 {
	//Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o seu novo salário, com 15% de aumento.

	public static void main(String[] args) {
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salario atual do funcionário:"));
		double aumento = salario + salario*0.15;
		
		JOptionPane.showMessageDialog(null, "Com o aumento, o salário do funcionário passa a ser R$" + aumento);

	}

}
