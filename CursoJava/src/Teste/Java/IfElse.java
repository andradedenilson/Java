package Teste.Java;

public class IfElse {
	public static void main (String[] args)
	 {
		//teste opradoes
		int nota1 = 100;
		int nota2 = 60;
		int nota3 = 100;
		int nota4 = 100;
		int media = 0;
		
		media =(nota1 + nota2 + nota3 + nota4)/4;
		
		/*Condições com logia  IF e ELSE*/
		if (media >= 70) {
			System.out.println("Aluno aprovado: "+ media);
		}else if (media >=40 && media <=69) {
			System.out.println("Aluno em recuperação: "+ media);
		} else {
			System.out.println("Aluno reprovado: "+ media);
		}
	 }
}
