package poo;

public class Main {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		
		/* Questão 1
		c1.numero =2; // O java pede que mudemos a visibilidade 
		*/
		
		//Questão 3
		c1.setTitular("Laysa");
		System.out.println(c1.getTitular());
		
		//Questão 5 - Sim, devemos ter um setter, pois precisamos dele para mudar o valor no construtor
		
		System.out.println(c1.getIdentificador());
		
		Conta c2 = new Conta();
		
		System.out.println(c2.getIdentificador());
		
		
		

	}

}
