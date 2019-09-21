import java.util.ArrayList;

public class Topik {
	ArrayList<Passageiro> passageiros;
	int capacidade;
	int preferenciais;
	
	public Topik(int capacidade, int preferenciais) {
		super();
		passageiros = new ArrayList<Passageiro>();
		this.capacidade = capacidade;
		this.preferenciais = preferenciais;
		for (int i = 0; i < capacidade; i++) { //preenchendo o vetor com nulo
			passageiros.add(null);
		}
	}

	public boolean verificarCheio() { //fun��o para verificar se a topik est� cheia
		for (Passageiro top : passageiros) { 
			if (top == null)  //se pelo menos um lugar estiver vazio, ela n�o est� cheia
				return false;
		}
		return true;  
	}

	public boolean verificarNome(String nome, Passageiro passageiro) { //verificando se o passageiro j� existe
		for (int d = 0; d < capacidade; d++) {
			if (passageiros.get(d) != null && passageiros.get(d).getNome().contentEquals(passageiro.getNome()))
				return true; //se for igual, ele j� existe
		}
		return false;
	}

	public void adicionar(Passageiro passageiro) {
		if (verificarNome(passageiro.getNome(), passageiro)) { //verifica se o passageiro j� existe
			System.out.println("Passageiro j� existente");
		} else { // se n�o existir 
			if (verificarCheio()) { //verifica se a topik est� cheia
				System.out.println("A topik est� cheia");
			} else { // se ela n�o estiver 
				if (passageiro.getIdade() >= 60) { //verifica se o passageiro � idoso
					for (int i = 0; i < capacidade; i++) {
						if (i < preferenciais) { // se estiver na ala dos preferenciais
							if (passageiros.get(i) == null) { // e se estiver vazio
								passageiros.set(i, passageiro); // altera  
								break;
							}
						} else if (i >= preferenciais) { // se n�o estiver vazio no preferencial, vai pro normal
							if (passageiros.get(i) == null) { // se estiver vazio
								passageiros.set(i, passageiro); // altera
								break;
							}
						}
					}
				} else if (passageiro.getIdade() < 60) { // se n�o for idoso 
					for (int i = 0; i < capacidade; i++) { 
						if (i >= preferenciais) { // se estiver na ala normal
							if (passageiros.get(i) == null) { // e se for nulo
								passageiros.set(i, passageiro); //altera
								break;
							}
						} else if (passageiros.get(capacidade - 1) != null) { //se chegar na ultima posi��o e n�o for nulo
							for (int x = 0; x < preferenciais; x++) { // entra na ala dos preferenciais
								if (passageiros.get(x) == null) { //e se for nulo
									passageiros.set(x, passageiro); //altera
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	public void remover(String nome) {
		for (int i = 0; i < passageiros.size(); i++) {
			if (passageiros.get(i) != null && passageiros.get(i).getNome().contentEquals(nome)) { //comparando os nomes
				System.out.println("Passageiro removido"); 
				passageiros.set(i, null); //se for igual, altera para nulo
				break;
			} else if (i == capacidade - 1) { // se chegar na ultima posi��o 
				if (passageiros.get(i) == null  || passageiros.get(i)!= null && passageiros.get(i).getNome().contentEquals(nome) == false ) { //e se n�o for igual {
					// o (passageiro.get(i) == null � para previnir null point exception caso o �ltimo seja nulo
					System.out.println("Esse passageiro n�o est� aqui"); // � porque ele n�o est�

				}
			}
		}
	}

	@Override
	public String toString() {
		String out = "[ ";
		for (int i = 0; i < capacidade; i++) {
			if (i < preferenciais) { // se for preferencial 
				if (passageiros.get(i) != null) { // e n�o for nulo
					out += passageiros.get(i) + " "; //coloca seus dados 
				} else { //sen�o
					out += "@ "; //coloca @
				}
			} else { // se for normal 
				if (passageiros.get(i) != null) { // e n�o for nulo
					out += passageiros.get(i) + " "; //coloca seus dados
				} else { //sen�o
					out += "= "; //coloca =
				}
			}
		}
		out += "]";
		return out;
	}

}
