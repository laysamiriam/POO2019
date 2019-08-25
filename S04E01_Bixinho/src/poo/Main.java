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
		int opcao=0;
		String nome;
		System.out.println("Digite um nome para o seu bixinho: ");
		nome = op.next();
		
		while (opcao!=6) {
			System.out.println("O que você quer fazer com o " + nome + "? \n 1 - brincar \n 2 - alimentar \n 3 - botar para dormir \n 4 - acordar \n 5 - status \n 6 - sair do jogo");
			opcao = op.nextInt();
			switch (opcao) {
			case 1:
				bob.brincar();
				break;
			case 2:
				System.out.println("Quanto você deseja dar de comida?");
				int comida = op.nextInt();
				bob.alimentar(comida);
				break;
			case 3:
				bob.dormir();
				break;
			case 4:
				bob.acordar();
				break;
			case 5:
				bob.status();
				break;
			}
		}
	
	}

}
