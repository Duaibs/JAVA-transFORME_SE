package exercicios.condicionais;

import javax.swing.JOptionPane;

public class ex007 {
	//Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos para
	//todos, mas especialmente para mulheres. Faça um programa que leia nome, sexo e
	//o valor das compras do cliente e calcule o preço com desconto.
	//Sabendo que: - Homens ganham 5% de desconto - Mulheres ganham 13% de
	//desconto

	public static void main(String[] args) {
		
	String nome = JOptionPane.showInputDialog(null, "Digite o seu nome:");
	int sexo = Integer.parseInt(JOptionPane.showInputDialog(null, "Seja bem vindo(a) à nossa loja, " + nome + "! Hoje temos um desconto especial para você! \n"
				+ "Digite '1' se você se identifica como homem ou \n"
				+ "Digite '2' se você se identifica como mulher!"));
	
	double valor = Double.parseDouble(JOptionPane.showInputDialog(null, nome + ", e qual foi o valor total das suas compras?" ));
	
	if (sexo == 1) {
		double desc = valor - (valor*0.05);
		JOptionPane.showMessageDialog(null, nome + ", a nossa loja lhe dará 05% de desconto, assim o valor total da sua compra será de: R$" + desc);
		
	} if (sexo == 2) {
		double desc = valor - (valor*0.13);
		JOptionPane.showMessageDialog(null, nome + ", a nossa loja lhe dará 13% de desconto, assim o valor total da sua compra será de: R$" + desc);
	
	} if (sexo != 1 && sexo != 2) {
		JOptionPane.showMessageDialog(null, nome + " seu comando foi inválido, tente novamente!");
	}

	}

}
