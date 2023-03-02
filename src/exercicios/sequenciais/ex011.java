package exercicios.sequenciais;
import javax.swing.JOptionPane;
public class ex011 {
	//Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são maiores do que 8.

	public static void main(String[] args) {
		int cont = 1;
		int cont8 = 0;
		
		do {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
			if (numero > 8) {
				cont8 = cont8 +1;
				}
			cont = cont +1;
		
			

	} while (cont <= 20);
		JOptionPane.showMessageDialog(null, "Destes números listados, " + cont8 + " são maiores que 08.");
}
}
