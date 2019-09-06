package poo;

public class Conta {
	private String titular;
	private int numero;
	private double saldo;
	private static int identificador;
	
	public Conta(String titular) {
		super();
		this.titular = titular;
		this.setIdentificador(getIdentificador()+1);
	}
	
	/*Quest�o 4 - Pois o Java n�o ir� deixar o programa rodar, caso eu s� tenha um construtor com par�metros 
	 * e eu n�o queira passar nenhum par�metro, sendo assim preciso de um construtor sem argumentos.
	 */
	
	public Conta() {
		this.setIdentificador(getIdentificador()+1);
	}
	
	/*
	 Quest�o 2
	O m�todo Setter foi feito apenas para o atributo saldo e titular, pois o numero raramente/nunca ser� alterado
	n�o necessitando do mesmo. Entretanto para ser seguro, o programa precisa estar encapsulado, ent�o 
	todos os atributos est�o privados e possuem o m�todo Getter.
	
	*/
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	
	
}
