package sequencias.basicas;
import javax.swing.JOptionPane;
public class ex005 {
//) Faça um programa que leia as duas notas de um aluno em uma matériae mostre na tela a sua média na disciplina.
	
	public static void main(String[] args) {		
		
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 1ª nota:"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 2ª nota:"));
		
		double media = (nota1 + nota2)/2;
		JOptionPane.showMessageDialog(null, "A média entre " + nota1 + " e " + nota2 + " é igual a"  + media);
			
	}
}
