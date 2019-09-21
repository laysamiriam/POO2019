import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Quantas vagas você quer que sua topik tenha?");
		Scanner op = new Scanner(System.in);
		int vagas = op.nextInt();
		System.out.println("Quantas vagas preferênciais você quer que sua topik tenha?");
		int preferenciais = op.nextInt();

		Topik t1 = new Topik(vagas, preferenciais);
		System.out.println(t1);

		Scanner op2 = new Scanner(System.in);
		
		while (true) {
			System.out.println("Você quer: adicionarPassageiro(nome,idade) ou removerPassageiro(nome)?");
			String opcao = op2.nextLine();
			String[] vet = opcao.split(" ");

			if (vet[0].equals("adicionar") || vet[0].equals("adicionarPassageiro")) {
				t1.adicionar(new Passageiro(vet[1], Integer.parseInt(vet[2])));
				System.out.println(t1);
				System.out.println("");
				continue;
			} else if (vet[0].equals("remover") || vet[0].equals("removerPassageiro")) {
				t1.remover(vet[1]);
				System.out.println(t1);
				System.out.println("");
				continue;
			} else {
				System.out.println("Não entendi. Digite novamente");
			}
		}
	}
}
