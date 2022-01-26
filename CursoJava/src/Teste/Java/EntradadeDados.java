package Teste.Java;

import javax.swing.JOptionPane;

public class EntradadeDados {
	public static void main (String[] args)
	 {
		String carros = JOptionPane.showInputDialog("Informe a quantidade Carros?");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade Pessoas?");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
				
		System.out.println("Sobrou: "+ resto);
		System.out.println("Divisão para pessoas: " + divisao);
		
		JOptionPane.showMessageDialog(null, "Sobrou: "+ resto);
		JOptionPane.showMessageDialog(null, "Divisão para pessoas: " + divisao);
		
	 }
}
