package arquivo;

public class Ventilador {
	private boolean estaLigado;
	private int velocidade;
	private boolean estaGirando;

	public void ligar() {
		if (this.isEstaLigado()) {
			System.out.println("O ventilador já está ligado");
		} else {
			this.setEstaLigado(true);
			this.setVelocidade(1);
			System.out.println("Ligando o ventilador");
		}
	}

	public void desligar() {
		if (!this.isEstaLigado()) {
			System.out.println("O ventilador já está desligado");
		} else {
			this.setEstaLigado(false);
			this.setVelocidade(0);
			System.out.println("Desligando o ventilador");
		}
	}

	public void girar() {
		if(this.isEstaGirando()) {
			System.out.println("O ventilador já está girando");
		}else {
			this.setEstaGirando(true);
			System.out.println("O ventilador está girando");
		}
	}

	public void pararDeGirar() {
		if(!this.isEstaGirando()) {
			System.out.println("O ventilador já estava parado");
		}else {
			this.setEstaGirando(false);
			System.out.println("O ventilador está parando de girar");
		}
	}
	public void aumentarVelocidade() {
		if(this.getVelocidade()<3) {
			this.setVelocidade(getVelocidade()+1);
			System.out.println("Velocidade aumentada para " + this.getVelocidade());
		}if (this.getVelocidade()==3) {
			System.out.println("O ventilador já está na velocidade máxima");
		}
	}

	public void diminuirVelocidade() {
		if(this.getVelocidade()>0) {
			this.setVelocidade(getVelocidade()-1);
			System.out.println("Velocidade reduzida para " + this.getVelocidade());
		}
	}

	public void showStatus() {
		System.out.println("Está ligado: " + this.isEstaLigado());
		System.out.println("Está girando: " + this.isEstaGirando());
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
