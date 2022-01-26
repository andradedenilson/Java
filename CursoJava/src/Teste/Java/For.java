package Teste.Java;

public class For {
	public static void main (String[] args)
	 {
		/*For estrutura de repetição*/
		for (int ll_repeticao = 0; ll_repeticao <= 10;  ll_repeticao++) {
			System.out.println("Numero FOR : "+ ll_repeticao);
		}
		
		for (int ll_repeticao = 10; ll_repeticao >= 0;  ll_repeticao--) {
			if(ll_repeticao ==7){
				System.out.println("encontrei o numero : "+ ll_repeticao);
				//para de processa
				break;
			}
			System.out.println("Numero FOR Inverso : "+ ll_repeticao);
			
		}
		
		//com continue
		for (int ll_repeticao = 10; ll_repeticao >= 0;  ll_repeticao--) {
			if(ll_repeticao ==7){
				System.out.println("encontrei o numero : "+ ll_repeticao);
				//continua o processo
				continue;
			}
			System.out.println("Numero FOR Inverso : "+ ll_repeticao);
			
		}
	 }
}
