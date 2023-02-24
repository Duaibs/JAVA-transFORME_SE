package exercicios.condicionais;

import javax.swing.JOptionPane;

public class ex008 {
	//Faça um algoritmo que pergunte a distância que um passageiro deseja percorrer em
	//Km. Calcule o preço da passagem, cobrando R$0.50 por Km para viagens até
	//200Km e R$0.45 para viagens mais longas.

	public static void main(String[] args) {
		double distancia = Double.parseDouble(JOptionPane.showInputDialog(null, "Olá, viajante. Diga-me qual a distância que você deseja percorrer:"));
		double valor = 0.0;
		if (distancia <= 200) {
			valor = distancia*0.5;
			JOptionPane.showMessageDialog(null, "O valor da viagem será de R$:" + valor);
		} else {
			valor = distancia*0.45;
			JOptionPane.showMessageDialog(null, "O valor da viagem será de R$:" + valor);
		}
	}

}
