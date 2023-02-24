package sequencias.basicas;
import javax.swing.JOptionPane;
public class ex010 {
//Faça um algoritmo que leia a largura e altura de uma parede, calcule e mostre a área a ser pintada e a quantidade de tinta necessária para o
//serviço, sabendo que cada litro de tinta pinta uma área de 2 metros².
	
	public static void main(String[] args) {
		 JOptionPane.showMessageDialog(null, "Vamos calcular quanto de tinta será necessária para se pintar uma determinada parede.");
		 
		 double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a medida da altura da parede?"));
		 double largura = Double.parseDouble(JOptionPane.showInputDialog(null, "E qual a medida da largura da parede?"));
		 
		 double area = altura*largura;
		 
		 double tinta = area/2;
		 
		 JOptionPane.showMessageDialog(null, "Como a parede possui " + area + "m², serão necessários " + tinta + " litros de tinta para pintá-la.");
		 

	}

}
