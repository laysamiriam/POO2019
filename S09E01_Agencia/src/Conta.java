
public abstract class Conta {
	protected int id;
	protected Cliente cliente;
	protected double saldo;
	protected String tipo;
	
	
	public Conta(Cliente cliente,int id) {
		super();
		this.cliente = cliente;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return ""+ this.getId() + ":" + this.getCliente() + ":" + this.getSaldo() + ":" + this.getTipo();
	}

	public void sacar(double valor){
		if(this.getSaldo()>=valor) {
			this.setSaldo(getSaldo()-valor);
		}else {
			throw new RuntimeException("Você não tem saldo suficiente para efetuar essa operação");
		}
	}
	
	public void depositar(double valor) {
		this.setSaldo(getSaldo()+valor);
	}
	
	public void transferir(Conta destino, double valor) {
		sacar(valor);
		destino.depositar(valor); // a linha de código mais sofrida desse trabalho	
	}
	
	public void update() {
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	
}
