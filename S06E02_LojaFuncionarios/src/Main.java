
public class Main {

	public static void main(String[] args) {
		Loja topson = new Loja("Loja Topson");
		topson.adicionarFuncionario("Laysa", "Gerente", 2500);
		topson.adicionarFuncionario("Guilherme","Vendedor", 998);
		System.out.println(topson);
		topson.removerFuncionario("Guilherme");
		System.out.println(topson);
		
	}

}
