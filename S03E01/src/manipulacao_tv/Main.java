package manipulacao_tv;

public class Main {

	public static void main(String[] args) {
Televisao t1 = new Televisao(20,true,10,false);
		
		t1.MudardeCanal(20);
		t1.LigarAntena();
		t1.MudardeCanal(10);
		t1.Status();

	}

}
