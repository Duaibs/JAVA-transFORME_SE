package sequencias.basicas;
import javax.swing.JOptionPane;
public class ex006 {
//Faça um programa que leia um número inteiro e mostre o seu antecessore seu sucessor.
	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro:"));
		int sucessor = numero + 1;
		int antecessor = numero - 1;
		
		JOptionPane.showMessageDialog(null, "O antecessor de " + numero + " é " + antecessor + ". O sucessor de " + numero + " é " + sucessor + "!");
	
	}

}
