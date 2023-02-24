package exercicios.condicionais;

import javax.swing.JOptionPane;

public class ex001 {
	//Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
	//80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso,
	//exiba o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.

	public static void main(String[] args) {
		
		double velocidadecarro = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade do carro: "));
		
		if(velocidadecarro > 80.0) {
			JOptionPane.showMessageDialog(null, "O veículo foi multado!!!!");
			
			double multa = velocidadecarro - 80.0;
			JOptionPane.showMessageDialog(null, "O veículo ultrapassou a velocidade em " + multa + " km/h!");
			multa = multa *5.0;
			JOptionPane.showMessageDialog(null, "O valor da multa sera de R$" + multa);
		} if(velocidadecarro <= 80.0) {
				JOptionPane.showMessageDialog(null, "Veiculo dentro do limite de velocidade, tenha uma boa viagem!");
	
		}

	}

}
