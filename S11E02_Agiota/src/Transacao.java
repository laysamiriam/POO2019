
public class Transacao {
	protected int idTran;
	protected String idCliente;
	private double valor;
	
	public Transacao(int idTran, String idCliente, double valor) {
		super();
		this.idTran = idTran;
		this.idCliente = idCliente;
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getIdTran() {
		return idTran;
	}
	public String getIdCliente() {
		return idCliente;
	}
	
	@Override
	public String toString() {
		return "id:" + this.getIdTran() + " [" + this.getIdCliente() + " " + this.getValor() +"]";
	}
	
}
