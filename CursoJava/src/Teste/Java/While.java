package Teste.Java;

public class While {
	public static void main (String[] args)
	 {
		/*Estrutura de repetição*/
		int numero = 0;
		while (numero <= 10) { /*Verifica e depois executa*/
			System.out.println("Numero: "+ numero);
			numero++;
		}
		
		/*Inverso*/
		int numero1 = 0;
		do { /*Primeiro executae e depois verifica*/
			System.out.println("Numero : "+ numero1);
			numero1++;
		} while (numero1 <= 20);
	 }
}
