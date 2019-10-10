
public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente, int id) {
		super(cliente, id);
	}

	public void update() {
		this.setSaldo(getSaldo()-20);
	}
	
	public String getTipo() {
		return tipo="CC";
	}
}
