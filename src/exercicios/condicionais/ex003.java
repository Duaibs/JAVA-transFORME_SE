package exercicios.condicionais;

import javax.swing.JOptionPane;

public class ex003 {
	//Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
	//média e mostre na tela. No final, analise a média e mostre se o aluno teve ou não
	//um bom aproveitamento (se ficou acima da média 7.0).	

	public static void main(String[] args) {
	
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
		
		JOptionPane.showMessageDialog(null, "Vamos digitar as notas do(a) aluno(a) " + nome + ": ");
		
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 1ª nota:"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 2ª nota:"));
		
		double media = (nota1 + nota2)/2;
		JOptionPane.showMessageDialog(null, "A média do(a) aluno(a) " + nome + " é : " + media);
		
		if(media >= 7.0) {
			JOptionPane.showMessageDialog(null, "O(A) aluno(a) " + nome + "teve um bom aproveitamento dos conteúdos das aulas");
		} else {
			JOptionPane.showMessageDialog(null, "O(A) aluno(a) " + nome + " precisa se aprofundar mais nos \n "
					+ "conteúdos das aulas para melhorar seu desempenho");
			
		}
	}

}
