package poo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Bixinho bob = new Bixinho();
		System.out.println("---------AVISOS--------");
		System.out.println("1 - Seu bixinho tem como nível máximo 100 de cada atributo");
		System.out.println("2 - Seu bixinho só pode morrer de fome e tristeza");
		System.out.println("3 - Cada vez que você brinca, seu bixinho fica 10% mais feliz, mas perde 10% de energia e saciedade");
		System.out.println("4 - Cada vez que seu bixinho dorme, ele aumenta 50% de energia mas perde 15% de felicidade e 20% de saciedade");
		System.out.println("\n");
		Scanner op = new Scanner(System.in);
		String opcao;
		String nome;
		//System.out.println("Digite um nome para o seu bixinho: ");
		//nome = op.next();
		
		while (true) {
			System.out.println("O que você quer fazer com seu bixinho " + "? \n brincar \n alimentar x \n dormir \n acordar \n status");
			
			opcao = op.nextLine();
			String[] vet = opcao.split(" ");
			
			if(vet[0].equals("brincar")) {
				bob.brincar();
			}else if (vet[0].equals("alimentar")) {
				int alimento = Integer.parseInt(vet[1]);
				bob.alimentar(alimento);
			}else if (vet[0].equals("dormir")) {
				bob.dormir();
			}else if(vet[0].equals("acordar")) {
				bob.acordar();
			}else if(vet[0].equals("status")){
				bob.status();
			}else {
				System.out.println("Não entendi. Digite novamente!");
			}
		}
	
	}

}
