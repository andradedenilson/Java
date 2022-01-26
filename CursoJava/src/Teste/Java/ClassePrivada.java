package Teste.Java;

import java.lang.Math;
import java.util.Iterator;

public class ClassePrivada {
	/*Metodo auto executavel em java*/
	
	public static void main (String[] args)
	 {
		double valor1 = 10;
		double valor2 = 20;
		double valor3 = 40;
		double valor4 = 60;
		
		double soma  = (valor1+valor2+valor3+valor4)/3;
		/*Arredondamento valor double*/
		System.out.println("Soma = "+ Math.round(soma * 100.0)/100.0);
		System.out.println("Soma = "+ arredondar(soma));
		
		/*CHAR Representa uma letra*/
		char pessoFeminino = 'F';
		if(pessoFeminino == 'F') {
			System.out.println("Feminino");
		}else{	
			System.out.println("Masculino");
		}
		
	 }
	
	private static double arredondar(double media){
		return Math.round(media * 100.0)/100.0;
	}	
}
