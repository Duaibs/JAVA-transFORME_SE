package exercicios.sequenciais;
import javax.swing.JOptionPane;
public class ex015 {
	//Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números. 
	//Encerre a execução quando um número negativo for digitado.

	public static void main(String[] args) {
		int soma = 0;
		int cont =1;
		
		JOptionPane.showMessageDialog(null, "Vamos digitar alguns números e somá-los");
		
		do {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("A somatória está em " + soma + ". Digite outro número: \n"
					+ "Ou digite um valor negativo para encerrar esta operação!"));
			if (numero >=0) {
			soma = soma + numero; 
					
			} else 	{
				cont =0;
			}
		} while (cont > 0);		
	
		JOptionPane.showMessageDialog(null, "O resultado da somatória é " + soma + ".");
	}
}


