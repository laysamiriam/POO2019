package manipulacao_tv;

public class Televisao {
	private int volume;
	private boolean ligada;
	private boolean hdmi;
	private int canal;
	private boolean antena;

	public Televisao(int volume, boolean ligada, int canal, boolean antena) {
		super();
		this.volume = volume;
		this.ligada = ligada;
		this.canal = canal;
		this.antena = antena;
	}

	public void Ligar() {
		if (this.isLigada()) {
			System.out.println("A Tv já está ligada");
		} else {
			this.setLigada(true);
			System.out.println("Tv ligada com sucesso");
		}
	}

	public void Desligar() {
		if (this.isLigada()) {
			this.setLigada(false);
			System.out.println("Tv desligada com sucesso");
		} else {
			System.out.println("Tv já está desligada");
		}
	}

	public void Aumentarvolume() {
		if (this.isLigada()) {
			if (this.getVolume() <= 50) {
				this.setVolume(this.getVolume() + 1);
				System.out.println(this.getVolume());
			} else {
				System.out.println("O volume já está no máximo");
			}
		} else {
			System.out.println("Primeiro ligue sua Tv");
		}
	}

	public void Diminuirvolume() {
		if (this.isLigada()) {
			if (this.getVolume() > 0) {
				this.setVolume(this.getVolume() - 1);
				System.out.println(this.getVolume());
			} else {
				System.out.println("O volume já está no mínimo");
			}
		} else {
			System.out.println("Primeiro ligue sua Tv");
		}
	}

	public void Mutar() {
		if (this.isLigada()) {
			this.setVolume(0);
			System.out.println("Mute");
		} else {
			System.out.println("Primeiro ligue sua Tv");
		}
	}

	public void Desmutar() {
		if (this.isLigada()) {
			this.setVolume(30);
			System.out.println("Desmutado");
		} else {
			System.out.println("Primeiro ligue sua Tv");
		}
	}

	public void LigarHdmi() {
		if (this.isLigada()) {
			if (this.isHdmi()) {
				System.out.println("Já está no HDMI");
			} else {
				this.setHdmi(true);
				this.setAntena(false);
				System.out.println("Tv está no HDMI");
			}
		} else {
			System.out.println("Primeiro ligue sua Tv");
		}
	}

	public void LigarAntena() {
		if (this.isLigada()) {
			if (this.isAntena()) {
				System.out.println("Já está na Antena");
			} else {
				this.setHdmi(false);
				this.setAntena(true);
				System.out.println("Tv está na Antena");
			}
		} else {
			System.out.println("Primeiro ligue sua Tv");
		}
	}

	public void MudardeCanal(int canal) {
		if (this.isLigada()) {
			if (this.antena) {
				this.setCanal(canal);
				System.out.println("Canal mudado para: " + this.getCanal());
			} else {
				System.out.println("Primeiro ligue sua antena");
			}

		} else {
			System.out.println("Primeiro ligue sua Tv");
		}
	}

	public void Status() {
		System.out.println("Antena: " + this.isAntena());
		System.out.println("HDMI: " + this.isHdmi());
		System.out.println("Canal: " + this.getCanal());
		System.out.println("Volume: " + this.getVolume());
		System.out.println("Ligada: " + this.isLigada());
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public boolean isHdmi() {
		return hdmi;
	}

	public void setHdmi(boolean hdmi) {
		this.hdmi = hdmi;
	}

	public boolean isAntena() {
		return antena;
	}

	public void setAntena(boolean antena) {
		this.antena = antena;
	}

}
