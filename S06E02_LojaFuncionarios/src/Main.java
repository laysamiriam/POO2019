import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Loja topson = new Loja("Loja Topson");
		/*topson.adicionarFuncionario("Laysa", "Gerente", 2500);
		topson.adicionarFuncionario("Guilherme","Vendedor", 998);
		System.out.println(topson);
		topson.removerFuncionario("Guilherme");
		System.out.println(topson);
		*/
		
		Scanner op = new Scanner(System.in);
		String salariostr= "ui";
		double salario;
		
		
		while (true) {
			System.out.println("Você quer: adiconarFuncionario(nome,funcao,salario), removerFuncionario(nome), darcomissao(valor) ou status");
			String opcao = op.nextLine();
			String[] vet = opcao.split(" ");
			
			if(vet[0].equals("adicionar") || vet[0].equals("adicionarfuncionario")  ) {
				salariostr = vet[3];
				salario = Double.parseDouble(salariostr);
				topson.adicionarFuncionario(vet[1], vet[2],salario);
				continue;
			}else if(vet[0].equals("remover") || vet[0].equals("removerfuncionario")) {	
				topson.removerFuncionario(vet[1]);
			}else if(vet[0].equals("status")){
				System.out.println(topson.toString());
				continue;
			}else if (vet[0].contentEquals("darcomissao")){
				topson.darComissao(Integer.parseInt(vet[1]));
			}else {
				System.out.println("Não entendi. Tente novamente");
			}
		}
		
		
		
	}	
}
