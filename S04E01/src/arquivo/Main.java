package arquivo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Ventilador arno = new Ventilador();
		Scanner op = new Scanner(System.in);
		int opcao=0;

		while (opcao!=8) {
			System.out.println("\n");
			//System.out.println("------- MENU -------");
			System.out.println("Selecione uma opção");
			System.out.println(" 1 - Ligar \n 2 - Desligar \n 3 - Girar \n 4 - Parar de Girar "
					+ " \n 5 - Aumentar Velocidade \n 6 - Diminuir Velocidade "
					+ "\n 7 - Show Status \n 8 - Sair");
			opcao = op.nextInt();
			System.out.println("\n");
			
			switch (opcao) {
			case 1:
				arno.ligar();
				break;
			case 2:
				arno.desligar();
				break;
			case 3:
				arno.girar();
				break;
			case 4:
				arno.pararDeGirar();
				break;
			case 5:
				arno.aumentarVelocidade();
				break;
			case 6:
				arno.diminuirVelocidade();
				break;
			case 7:
				arno.showStatus();
				break;
			}
		}
	}

}
