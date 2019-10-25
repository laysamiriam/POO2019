import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		String valorstr="ui";
		double valor = 0;
		
		System.out.println("Primeiro, vamos criar seu sistema de agiotagem. Com quantos $$$$ você deseja começar? ");
		Scanner op = new Scanner(System.in);
		double cash = op.nextDouble();
		Sistema s1 = new Sistema(cash);
		Scanner op2 = new Scanner(System.in);
		
		
		while (true) {
			System.out.println(" ");
			System.out.println("addCli(id, nome completo) | emprestar(id, valor) | receber (id,valor) | matar (id) | historico | filtrar(id) | resumo | exit");
			String opcao = op2.nextLine();
			String[] vet = opcao.split(" ");
			
			try {
				if(vet[0].equals("add") || vet[0].equals("addCli")){
					String nome="";
					for(int i=2;i<vet.length;i++) {
						nome += " " + vet[i];
					}
					s1.addCli(new Cliente(vet[1],nome));
					continue;
				}else if(vet[0].equals("emprestar")) {
					valorstr = vet[2];
					valor = Double.parseDouble(valorstr);
					s1.emprestar(vet[1],valor);
					continue;
				}else if(vet[0].equals("receber")) {
					valorstr = vet[2];
					valor = Double.parseDouble(valorstr);
					s1.receber(vet[1],valor);
					continue;
				}else if(vet[0].equals("matar")) {
					s1.matar(vet[1]);
					continue;
				}else if(vet[0].equals("historico")) {
					s1.historico();
					continue;
				}else if(vet[0].equals("resumo")) {
					s1.resumo();
					continue;
				}else if(vet[0].equals("filtrar")) {
					s1.filtrar(vet[1]);
					continue;
				}else if(vet[0].equals("exit")) {
					break;
				}else {
					throw new RuntimeException("Fail: comando inválido");
				}
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Você esqueceu de colocar um parâmetro");
			}catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
