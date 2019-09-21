
public class Passageiro {
	private String nome;
	private int idade;
	
	public Passageiro(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	
	@Override
	public String toString() {
		return this.nome + ":" + this.idade;
	}
}
