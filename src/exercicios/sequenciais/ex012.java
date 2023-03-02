package exercicios.sequenciais;
import javax.swing.JOptionPane;
public class ex012 {
	//Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares

	public static void main(String[] args) {
		int cont = 1;
		int contpar = 0;
		
		do {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
			if (numero % 2 == 0) {
				contpar = contpar +1;
				}
			cont = cont +1;
		
			

	} while (cont <= 20);
		JOptionPane.showMessageDialog(null, "Destes números listados, " + contpar + " são pares");
}
}
