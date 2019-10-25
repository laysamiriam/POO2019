import java.util.Map;
import java.util.TreeMap;

public class Cliente {
	protected String idCliente;
	protected String nomeComp;
	Map<Integer,Transacao> transacoes;
	protected double saldo=0;
	
	public Cliente(String idCliente, String nomeComp) {
		super();
		this.idCliente = idCliente;
		this.nomeComp = nomeComp;
		transacoes = new TreeMap<Integer,Transacao>();
	}
	
	public String getIdCliente() {
		return idCliente;
	}
	
	public String getNomeComp() {
		return nomeComp;
	}

	public void setNomeComp(String nomeComp) {
		this.nomeComp = nomeComp;
	}

	public Map<Integer, Transacao> getTransacoes() {
		return transacoes;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "" + this.getIdCliente() +  this.getNomeComp() + ":" + this.getTransacoes();
	}
}
