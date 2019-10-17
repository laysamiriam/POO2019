import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Mapa m1 = new Mapa();
		Scanner opcao = new Scanner(System.in);

		while (true) {
			
			System.out.println("Adicionar(chave,valor) | remover(valor) | listar");
			
			String op = opcao.nextLine();
			String[] vet = op.split(" ");
			
			try {
				if (vet[0].equals("adicionar")) {
					m1.adicionar(vet[1], vet[2]);
					continue;
				} else if (vet[0].equals("removervalor")) {
					m1.remover(vet[1]);
					continue;
				} else if (vet[0].equals("listar")) {
					m1.listar();
					continue;
				}else {
					System.out.println("Não entendi");
				}
			}catch (RuntimeException e){
				System.out.println(e.getMessage());
			}
		
	}

	}
}
