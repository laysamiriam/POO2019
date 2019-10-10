import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Agencia a1 = new Agencia();
		String valorstr = "ui";
		double valor;

		Scanner opcao = new Scanner(System.in);

		while (true) {
			try {
				if (a1.contas.size() == 0) {
					System.out.println("Primeiro, você precisa adicionar seu primeiro cliente");
					System.out.println("Digite um nome para ele: ");
					String op = opcao.nextLine();
					a1.addCliente(op);
				}
				System.out.println("");
				System.out.println("O que você deseja fazer: adicionar(id), sacar(id, valor), depositar(id, valor), "
						+ "\ntransferir(Id, IdDestino, Valor), update ou status.");

				String op = opcao.nextLine();
				String[] vet = op.split(" ");

				if (vet[0].equals("adicionar") || vet[0].equals("add")) {
					a1.addCliente(vet[1]);
					continue;

				} else if (vet[0].equals("sacar")) {
					int id = Integer.parseInt(vet[1]);
					valorstr = vet[2];
					valor = Double.parseDouble(valorstr);
					if(a1.checar(id)==false) {
						a1.contas.get(id).sacar(valor);
						continue;
					}

				} else if (vet[0].equals("status")) {
					for (int i = 0; i < a1.contas.size(); i++) {
						System.out.println(a1.contas.get(i));
					}
					continue;

				} else if (vet[0].equals("depositar")) {
					int id = Integer.parseInt(vet[1]);
					valorstr = vet[2];
					valor = Double.parseDouble(valorstr);
					if(a1.checar(id)==false) {
						a1.contas.get(id).depositar(valor);
						continue;
					}
				} else if (vet[0].equals("transferir")) {
					int id = Integer.parseInt(vet[1]);
					int idestino = Integer.parseInt(vet[2]);
					if (a1.checar(id) == false) {
						valorstr = vet[3];
						valor = Double.parseDouble(valorstr);
						Conta b1 = a1.contas.get(idestino);
						a1.contas.get(id).transferir(b1, valor);
						continue;
					}
				} else if (vet[0].equals("update")) {
					a1.update();
				} else {
					System.out.println("Não entendi. Digite novamente");
				}
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Você esqueceu de digitar algo");
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
