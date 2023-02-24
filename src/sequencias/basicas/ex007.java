package sequencias.basicas;
import javax.swing.JOptionPane;
public class ex007 {
//Crie um algoritmo que leia um número real e mostre na tela o seu dobroe a sua terça parte
	public static void main(String[] args) {
		
		double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número real:"));
		double dobro = numero*2;
		double terco = numero/3;
		
		JOptionPane.showMessageDialog(null, "O dobro de " + numero + " é " + dobro + ". A terça parte de " + numero + " é " + terco + ".");
		
	}

}
