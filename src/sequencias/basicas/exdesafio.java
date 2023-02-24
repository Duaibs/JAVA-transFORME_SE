package sequencias.basicas;
import javax.swing.JOptionPane;
public class exdesafio {
	//Escreva um programa para calcular a redução do tempo de vida de um fumante. Pergunte a quantidade de cigarros fumados por dias e 
	//quantos anos ele já fumou. Considere que um fumante perde 10 min devida a cada cigarro. Calcule quantos dias de vida um fumante perderá e 
	//exiba o total em dias.

	public static void main(String[] args) {
		double cigardia = Double.parseDouble(JOptionPane.showInputDialog("Quantos cigarros são fumados por dia?"));
		double cigaranos = Double.parseDouble(JOptionPane.showInputDialog("Há quantos anos a pessoa fuma?"));
		double totalcigarros = cigardia*cigaranos*365;
		
		JOptionPane.showMessageDialog(null, "Foram fumados no total " + totalcigarros + " cigarros ao longo de sua vida!");
		
		double tempodevida = (totalcigarros*10)/1440;
		
		JOptionPane.showMessageDialog(null, "Esta pessoa viverá" + tempodevida + " dias a menos por conta do cigarro!");
		

	}

}
