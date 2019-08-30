package poo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Unicornio fofo = new Unicornio();
		Scanner op = new Scanner(System.in);
		String opcao;
		System.out.println("Fomato: ação + quantidade");
		
		while (true) {
			System.out.println("O que você quer fazer? ");
			System.out.println("voar | subir | darCarinho | brigar | status");
			opcao = op.nextLine();
			String[]vet = opcao.split(" ");
			
			if(vet[0].equals("voar")) {
				fofo.voar(Integer.parseInt(vet[1]));
			}else if(vet[0].equals("subir")) {
				fofo.subir(Integer.parseInt(vet[1]));
			}else if(vet[0].equals("darCarinho") || vet[0].equals("darcarinho") ) {
				fofo.darCarinho(Integer.parseInt(vet[1]));
			}else if(vet[0].equals("brigar")) {
				fofo.brigar(Integer.parseInt(vet[1]));
			}else if(vet[0].equals("status")) {
				fofo.status();
			}else {
				System.out.println("Não entendi, digite novamente.");
			}
			
		}

	}

}
