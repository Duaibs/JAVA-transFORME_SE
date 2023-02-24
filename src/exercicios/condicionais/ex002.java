package exercicios.condicionais;

import javax.swing.JOptionPane;

public class ex002 {
	//Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
	//dela e depois mostre se ela pode ou não votar.

	public static void main(String[] args) {
		final int anoatual = 2023;
		
		int anonascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento"));
		int idade = (anoatual - anonascimento);
		JOptionPane.showMessageDialog(null,"A sua idade é de " + idade + " anos!");
		
		if(idade > 15 && idade < 18 || idade > 70) {
			JOptionPane.showMessageDialog(null,"Na sua idade o voto não é obrigatório");
			
		}if(idade < 16) {
			JOptionPane.showMessageDialog(null, "Desculpe, você não tem idade permitida para votar");
			
		}if (idade > 17 && idade < 70) {
			JOptionPane.showMessageDialog(null,"O seu voto é obrigatório");
		}
	}

}
