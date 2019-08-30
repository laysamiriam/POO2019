package poo;

public class Unicornio {
	private int passageiros=0;
	private int passageirosMax = 3;
	private int carinhometro;
	private int maxCarinhometro = 50;
	private int km;
	
	
	/*public Unicornio(int passageiros, int carinhometro) {
		super();
		this.passageiros = passageiros;
		this.carinhometro = carinhometro;
	}*/
	
	public void voar(int distancia) {
		if(this.getPassageiros()>0) {
			if(this.getCarinhometro()*10>=distancia) {
				this.setCarinhometro(this.getCarinhometro()-(distancia/10));
				this.setKm(this.getKm()+distancia);
				System.out.println("Uauuu, estamos voando");
			}else {
				System.out.println("Você precisa me dar mais carinho");
			}
		}else{
			System.out.println("Só vou voar se alguém vier junto comigo");
		}
	}
	
	public void subir(int qtd) {
		if((this.getPassageiros()+ qtd)> this.getPassageirosMax()) {
			System.out.println("Eu sou um unicórnio, não um trem");
		}else {
			this.setPassageiros(this.getPassageiros()+qtd);
			System.out.println("Embarcando, uhul");
		}
			
	}
	
	public void darCarinho (int qtd) {
		if(this.getCarinhometro()+qtd>this.getMaxCarinhometro()) {
			System.out.println("Ave Maria, eu sou um unicórnio, não um avião");
		}else {
			this.setCarinhometro(this.getCarinhometro()+qtd);
			System.out.println("Estou me sentinto amado");
		}
	}
	
	public void brigar(int qtd) {
		if(this.getCarinhometro()-qtd<=0) {
			this.setCarinhometro(0);
			System.out.println("Poxa, o que eu te fiz para você brigar tanto assim comigo?");
		}else {
			this.setCarinhometro(this.getCarinhometro()-qtd);
			System.out.println("Estou me sentindo menos amado");
		}
	}
	
	public void status(){
		System.out.println("Carinho: " + this.getCarinhometro() + "/" + this.getMaxCarinhometro());
		System.out.println("Passageiros: " + this.getPassageiros() + "/" + this.getPassageirosMax());
		System.out.println("Kms voados: "+ this.getKm());
	}
	public int getPassageiros() {
		return passageiros;
	}



	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}



	public int getPassageirosMax() {
		return passageirosMax;
	}



	public void setPassageirosMax(int passageirosMax) {
		this.passageirosMax = passageirosMax;
	}



	public int getCarinhometro() {
		return carinhometro;
	}



	public void setCarinhometro(int carinhometro) {
		this.carinhometro = carinhometro;
	}



	public int getMaxCarinhometro() {
		return maxCarinhometro;
	}


	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public void setMaxCarinhometro(int maxCarinhometro) {
		this.maxCarinhometro = maxCarinhometro;
	}

}
