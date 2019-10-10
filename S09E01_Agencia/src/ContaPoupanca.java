
public class ContaPoupanca extends Conta {
	public ContaPoupanca(Cliente cliente, int id) {
		super(cliente, id);
	}
	
	@Override
	public void update() {
		double calculo = (this.getSaldo()*1)/100;
		this.setSaldo(this.getSaldo()+calculo);
	}
	
	public String getTipo() {
		return tipo="CP";
	}
}
