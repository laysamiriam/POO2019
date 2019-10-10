import java.util.ArrayList;

public class Cliente {
	private String id;
	ArrayList<Conta>contas;
	

	public Cliente(String id) {
		super();
		this.id = id;
	}
	
	
	public ArrayList<Conta> getContas() {
		return contas;
	}


	@Override
	public String toString() {
		return this.getId();
	}
	
	public String getId() {
		return id;
	}
	
	
}
