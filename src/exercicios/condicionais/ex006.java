package exercicios.condicionais;

import javax.swing.JOptionPane;

public class ex006 {
//Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
//situação em relação ao alistamento militar. - Se estiver antes dos 18 anos, mostre
//em quantos anos faltam para o alistamento. - Se já tiver depois dos 18 anos, mostre
//quantos anos já se passaram do alistamento.
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Jovem, se você completa 18 anos este ano, você deve se alistar às forças armadas!!!");
		String nome = JOptionPane.showInputDialog(null, "Qual é o seu nome:");
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é a sua idade " + nome + "?"));
		
		if (idade < 18) {
			JOptionPane.showMessageDialog(null, nome + " você ainda não precisa se alistar, pois falta(m) " + (18-idade) + " anos para seu alistamento.\n"
					+ " Nos veremos em breve.");
			
		} if (idade == 18) {
			JOptionPane.showMessageDialog(null, "ATENÇÃO " + nome + " você deve se alistar ainda este ano! \n"
					+ "Atente-se aos prazos!");
			
		} if (idade >  18) {
			JOptionPane.showMessageDialog(null, nome + " você se alistou (ou deveria ter se alistado)  há " + (idade - 18) + " anos!" );
		}

	}

}
