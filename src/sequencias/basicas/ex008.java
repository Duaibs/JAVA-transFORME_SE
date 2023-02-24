package sequencias.basicas;
import javax.swing.JOptionPane;
public class ex008 {
//Desenvolva um programa que leia uma distância em metros e mostreosvalores relativos em outras medidas.
	public static void main(String[] args) {
		
		double metro = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite uma distância em metros:"));
		
		double km = metro/1000;
		double hm = metro/100;
		double dam = metro/10;
		
		double dc = metro*10;
		double cm = metro*100;
		double mm = metro*1000;
		
		JOptionPane.showMessageDialog(null, "A distância de " + metro + " equivale a:\n"
				+  km + " Km \n" +  hm + " Hm \n" + dam + " Dam \n \n" + dc + " dc \n" + cm + " cm \n" + mm + " mm.");
		

	}

}
