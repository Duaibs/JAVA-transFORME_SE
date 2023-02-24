package sequencias.basicas;
import javax.swing.JOptionPane;
public class ex012 {
//Crie um programa que leia o preço de um produto, calcule e mostre o seu PREÇO PROMOCIONAL, com 5% de desconto.
	public static void main(String[] args) {
		double  bruto = Double.parseDouble(JOptionPane.showInputDialog(null, "Estamos com um preço promocional da loja toda com 05% de desconto. \n Qual o valor das suas compras?"));		
		double valor = bruto - bruto*0.05;
		
		JOptionPane.showMessageDialog(null, "Com a nossa promoção suas suas compras saem de R$" + bruto + " por R$" + valor);
	}

}
