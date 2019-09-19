
public class Funcionario {
	private String nome;
	private String funcao;
	private double salario;
	
	public Funcionario(String nome, String funcao, double salario) {
		super();
		this.nome = nome;
		this.funcao = funcao;
		this.salario = salario;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	@Override
	public String toString() {
		return "[Nome: " + this.getNome() +  " | Função: " + this.getFuncao() + " | Salário: " + this.getSalario() + "]"+ "\n";
	}
	
	
}