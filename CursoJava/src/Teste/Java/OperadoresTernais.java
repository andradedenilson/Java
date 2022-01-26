package Teste.Java;

public class OperadoresTernais {
	public static void main (String[] args)
	 {
		int media = 60;
		/*Operadore ternarias são para micro validações*/
		String saidaResultado;
		
		saidaResultado = media >= 70 ? "Aluno Aprovado" : (media >=40 && media <=69)? "Aluno em recuperacao":"Aluno Reprovado";
		System.out.println(saidaResultado);
	 }
}
