package exercicios.sequenciais;
import javax.swing.JOptionPane;
public class ex014 {
	//Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100, quantos estão entre 
	//101 e 200 e quantos são maiores de 200.

	public static void main(String[] args) {
			int cont = 1;
			int contp = 0;
			int contm = 0;
			int contg =0;
					
			
			do {
				double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um múmero qualquer:"));
					if (numero >= 0 && numero <= 100) {
						contp = contp +1;
						cont = cont +1;
					} if (numero >100  && numero <= 200) {
						contm = contm +1;
					} if (numero > 200) {
						contg = contg +1;
					}
					
				
				
			} while (cont <= 20);
			
			JOptionPane.showMessageDialog(null,"Foram digitados: \n " + contp + " números entre 0 e 100. \n" + contg + " números entre 100 e 200.\n"
					 + contg + " números maiores que 200.");
				
			

		


	}

}
