package poo;

public class Exercicios {

	public static void main(String[] args) {
		// Questao 1
		for (int i = 150; i < 301; i++) {
			System.out.println(i);
		}

		// Questao 2
		double soma = 0;
		for (int i = 1; i < 1001; i++) {
			soma = soma + i;
		}
		System.out.println(soma);

		// Questao 3
		for (int i = 0; i < 101; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		} 

		/*// Questao 4 
		int fatorial = 1;
		for (int i = 1; i <= 10; i++) {
			fatorial = fatorial * i;
			System.out.println("O fatorial de " + i + " é " + fatorial);
		}
	} */
		
		//Questao 5
		long fatorial = 1;
		for (int i = 1; i <= 40; i++){
			fatorial = fatorial * i;
			System.out.println("O fatorial de " + i + " é " + fatorial);
		}
		
		//Questao 6
		int a = 1;
		int b = 0;
		int aux;  
		System.out.println(b);
        for(int i = 0; i < 12; i++){
        	if (a>100) {
        		break;
        	}else{
	        	System.out.println(a);
	            aux = a;
	            a = a + b;
	            b = aux;
        	}
        }
		
		//Questao 7
		int x = 13;
		while (x!=1){
			if (x % 2 == 0) {
				x = x / 2;
				System.out.println(x);
			}else{
				x = (3 * x) + 1;
				System.out.println(x);
			}
		}
	}
}
