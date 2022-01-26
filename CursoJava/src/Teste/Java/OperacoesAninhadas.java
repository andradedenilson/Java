package Teste.Java;

public class OperacoesAninhadas {
	public static void main (String[] args)
	 {
		int media= 50;
		/*operações aninhadas*/
		if (media >= 50) {
			if (media >= 70) {	
				if (media >= 90) {
				System.out.println("Aluno aprovado - Parabens: "+ media);
				}else {
					System.out.println("Aluno aprovado Direto: "+ media);
				}	
			} else {
				System.out.println("Aluno Recuperação: "+ media);
			}
		}else {
			System.out.println("Aluno reprovou: "+ media);
		}
	 }
}
