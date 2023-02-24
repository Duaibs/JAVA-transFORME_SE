package exercicios.condicionais;

import javax.swing.JOptionPane;

public class ex_desafio {
	//Crie um programa que leia o tamanho de três segmentos de reta. Analise seus
	//comprimentos e diga se é possível formar um triângulo com essas retas. Matematicamente,
	//para três segmentos formarem um triângulo, o comprimento de cada lado deve ser menor
	//que a soma dos outros dois.
	public static void main(String[] args) {
	
		JOptionPane.showMessageDialog(null, "Vamos coletar 03 segmentos de retas e analisar se será possível formar um triângulo com elas!");
		
		double reta1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do 1º segmento de reta:" ));
		double reta2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do 2º segmento de reta:" ));
		double reta3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do 3º segmento de reta:" ));
		
		if ((reta1 < (reta2 + reta3)) && (reta2 < (reta1 + reta3 )) & ((reta3 < (reta2+reta1)))) {
			JOptionPane.showMessageDialog(null, "Sim, é possível fazer um triângulo com estes segmentos de reta!");
		} else {
			JOptionPane.showMessageDialog(null, "Não, não é possível fazer um triângulo com estes segmentos de reta!");
	}
}
}