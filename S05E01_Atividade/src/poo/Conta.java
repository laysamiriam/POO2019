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
	
	/*Questão 4 - Pois o Java não irá deixar o programa rodar, caso eu só tenha um construtor com parâmetros 
	 * e eu não queira passar nenhum parâmetro, sendo assim preciso de um construtor sem argumentos.
	 */
	
	public Conta() {
		this.setIdentificador(getIdentificador()+1);
	}
	
	/*
	 Questão 2
	O método Setter foi feito apenas para o atributo saldo e titular, pois o numero raramente/nunca será alterado
	não necessitando do mesmo. Entretanto para ser seguro, o programa precisa estar encapsulado, então 
	todos os atributos estão privados e possuem o método Getter.
	
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
