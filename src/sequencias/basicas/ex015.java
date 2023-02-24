package sequencias.basicas;

import javax.swing.JOptionPane;

public class ex015 {
	//Crie um programa que leia o número de dias trabalhados em um mês e mostre o salário de um funcionário, sabendo que ele trabalha 8 horas por
	//dia e ganha R$25 por hora trabalhada.

	public static void main(String[] args) {
		int dias = Integer.parseInt(JOptionPane.showInputDialog("Por quantos dias o funcionário prestou serviço?"));
		int total = dias*25*8;
		
		JOptionPane.showMessageDialog(null, "O funcionário deve receber a importância de R$" + total);
		

	}

}
