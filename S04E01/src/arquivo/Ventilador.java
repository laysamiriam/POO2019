package arquivo;

public class Ventilador {
	private boolean estaLigado;
	private int velocidade;
	private boolean estaGirando;

	public void ligar() {
		if (this.isEstaLigado()) {
			System.out.println("O ventilador j� est� ligado");
		} else {
			this.setEstaLigado(true);
			this.setVelocidade(1);
			System.out.println("Ligando o ventilador");
		}
	}

	public void desligar() {
		if (!this.isEstaLigado()) {
			System.out.println("O ventilador j� est� desligado");
		} else {
			this.setEstaLigado(false);
			this.setVelocidade(0);
			System.out.println("Desligando o ventilador");
		}
	}

	public void girar() {
		if(this.isEstaGirando()) {
			System.out.println("O ventilador j� est� girando");
		}else {
			this.setEstaGirando(true);
			System.out.println("O ventilador est� girando");
		}
	}

	public void pararDeGirar() {
		if(!this.isEstaGirando()) {
			System.out.println("O ventilador j� estava parado");
		}else {
			this.setEstaGirando(false);
			System.out.println("O ventilador est� parando de girar");
		}
	}
	public void aumentarVelocidade() {
		if(this.getVelocidade()<3) {
			this.setVelocidade(getVelocidade()+1);
			System.out.println("Velocidade aumentada para " + this.getVelocidade());
		}if (this.getVelocidade()==3) {
			System.out.println("O ventilador j� est� na velocidade m�xima");
		}
	}

	public void diminuirVelocidade() {
		if(this.getVelocidade()>0) {
			this.setVelocidade(getVelocidade()-1);
			System.out.println("Velocidade reduzida para " + this.getVelocidade());
		}
	}

	public void showStatus() {
		System.out.println("Est� ligado: " + this.isEstaLigado());
		System.out.println("Est� girando: " + this.isEstaGirando());
		System.out.println("Velocidade: " + this.getVelocidade());
	}

	public boolean isEstaLigado() {
		return estaLigado;
	}

	public void setEstaLigado(boolean estaLigado) {
		this.estaLigado = estaLigado;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public boolean isEstaGirando() {
		return estaGirando;
	}

	public void setEstaGirando(boolean estaGirando) {
		this.estaGirando = estaGirando;
	}

}
