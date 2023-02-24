package sequencias.basicas;
import javax.swing.JOptionPane; 
public class ex011 {
//Desenvolva uma lógica que leia os valores de A, B e C de uma equaçãodo segundo grau e mostre o valor de Delta.
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Vamos calcular agora o valor de Delta de uma equação do 2º grau:");
		
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de A:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de B:"));
		int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de C:"));
		int d = b*b - 4*a*c;
		
		JOptionPane.showMessageDialog(null, "O valor de Delta desta equação é " + d + ".");
	}

}
