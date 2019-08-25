package poo;

public class Bixinho {
	private int energia = 50;
	private int saciedade = 30;
	private int felicidade = 50;
	private boolean acordado = true;

	public boolean morreu() {
		if (this.getFelicidade() == 0 || this.getSaciedade() == 0) {
			return true;
		}
		return false;
	}

	public void alimentar(int comida) {
		if (!morreu()) {
			if (this.isAcordado()) {
				if ((this.getSaciedade() + comida) < 100) {
					this.setSaciedade(this.getSaciedade() + comida);
					System.out.println("Seu bixinho foi alimentado com sucesso");
				} else {
					System.out.println("Você vai explodir seu bixinho se continuar assim");
					this.setSaciedade(100);
				}
			} else {
				System.out.println("Seu bixinho precisa acordar para se alimentar");
			}
		} else {
			System.out.println("Poxa, seu bixinho morreu :( ");
		}
	}

	public void brincar() {
		if (!morreu()) {
			if (this.isAcordado()) {
				if ((this.getEnergia() > 10)) {
					this.setEnergia(getEnergia() - 10);
					this.setFelicidade(getFelicidade() + 10);
					this.setSaciedade(getSaciedade() - 10);
					System.out.println("Vocês brincaram muito hahah!");
					if (this.getFelicidade() > 100) {
						this.setFelicidade(100);
					}
				} else {
					System.out.println("Não podemos jogar agora :( Seu bixinho está desmaiando de sono, coloque-o para dormir!");
				}
			} else {
				System.out.println("Seu bixinho precisa acordar para brincar!");
			}
		} else {
			System.out.println("Poxa, seu bixinho morreu :( ");
		}
	}

	public void dormir() {
		if (!morreu()) {
			this.setEnergia(getEnergia() + 50);
			this.setSaciedade(getSaciedade() - 20);
			this.setFelicidade(getFelicidade() - 15);
			this.setAcordado(false);
			System.out.println("Seu bixinho está contando carneirinhos!");
			if (this.getEnergia() > 100) {
				this.setEnergia(100);
			}
		} else {
			System.out.println("Poxa, seu bixinho morreu :( ");
		}
	}

	public void acordar() {
		if (!this.isAcordado()) {
			this.setAcordado(true);
			System.out.println("Seu bixinho está com a bateria 50% mais carregada!");
		} else {
			System.out.println("Seu bixinho já estava acordado!");
		}
	}

	public void status() {
		System.out.println("Acordado: " + this.isAcordado());
		System.out.println("Saciedade: " + this.getSaciedade());
		System.out.println("Energia: " + this.getEnergia());
		System.out.println("Felicidade: " + this.getFelicidade());
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public int getSaciedade() {
		return saciedade;
	}

	public void setSaciedade(int saciedade) {
		this.saciedade = saciedade;
	}

	public int getFelicidade() {
		return felicidade;
	}

	public void setFelicidade(int felicidade) {
		this.felicidade = felicidade;
	}

	public boolean isAcordado() {
		return acordado;
	}

	public void setAcordado(boolean acordado) {
		this.acordado = acordado;
	}

}
