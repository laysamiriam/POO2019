import java.util.ArrayList;

public class Loja {
	private String id;
	private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

	public Loja(String id) {
		super();
		this.id = id;
		this.funcionarios = new ArrayList<Funcionario>(); // Composição pq os funcionários só existem se a loja existir
	}

	public void adicionarFuncionario(String nome, String funcao, double salario) {
		this.funcionarios.add(new Funcionario(nome, funcao, salario));
		System.out.println("Funcionário " + nome + " adicionado com sucesso!");
	}

	public void removerFuncionario(String nome) {
		for (int i=0; i<funcionarios.size();i++) {
			if (funcionarios.get(i).getNome().equals(nome)) {
				funcionarios.remove(funcionarios.get(i));
				System.out.println("Funcionário " + nome + " removido com sucesso!");
				break;
			}else if(i==(funcionarios.size()-1)) {
				System.out.println("Funcionários não encontrado");
			}
			
		}
		
	}

	@Override
	public String toString() {
		return this.getId() + this.getFuncionarios();
	}

	public String getId() {
		return id;
	}

	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

}
