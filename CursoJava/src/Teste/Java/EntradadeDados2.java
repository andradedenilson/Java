package Teste.Java;

import javax.swing.JOptionPane;

public class EntradadeDados2 {
	public static void main (String[] args)
	 {
		String carros = JOptionPane.showInputDialog("Informe a quantidade Carros?");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade Pessoas?");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		int retorno = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado?");
		
		if (retorno == 0) { 
			JOptionPane.showMessageDialog(null, "Sobrou: "+ resto);
			JOptionPane.showMessageDialog(null, "Divisão para pessoas: " + divisao);
		}
	 }
}
