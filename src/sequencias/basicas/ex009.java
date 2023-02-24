package sequencias.basicas;
import javax.swing.JOptionPane;
public class ex009 {
	//Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira(em R$) e mostre quantos dólares ela pode comprar. 
	//Considere US$1,00=R$3,45.

	public static void main(String[] args) {
		double real = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantos reais você possui em sua carteira?"));
		double dolar = real/3.45;
		
		JOptionPane.showMessageDialog(null, "Com R$" + real + " em sua carteira você pode comprar até US$" + dolar);

	}

}
