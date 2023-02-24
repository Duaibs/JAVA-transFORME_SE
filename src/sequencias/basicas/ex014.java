package sequencias.basicas;
import javax.swing.JOptionPane;
public class ex014 {
	//A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um programa que pergunte a quantidade de Km percorridos por
	//um carro alugado e a quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar, sabendo que o carro custa R$90 por diae
	//R$0,20 por Km rodado.

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Olá, seja bem-vindo. \n Vamos calcular o valor do aluguel do veículo alugado!");
		
		double km = Double.parseDouble(JOptionPane.showInputDialog("Quantos kilometros foram percorridos?"));
		double dias = Double.parseDouble(JOptionPane.showInputDialog("Por quantos dias o veículo foi alugado?"));
		double valor = (km*0.2) + (dias*90);
		
		JOptionPane.showMessageDialog(null, "Muito bem, o valor total das despesas é de R$" + valor);
		

	}

}
