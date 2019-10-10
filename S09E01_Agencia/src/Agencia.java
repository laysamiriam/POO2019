import java.util.ArrayList;

public class Agencia {
	ArrayList<Cliente> clientes;
	ArrayList<Conta> contas;

	public Agencia() {
		this.clientes = new ArrayList<Cliente>();
		this.contas = new ArrayList<Conta>();
	}

	public boolean checar(int d) {
		if (contas.size() <= d) {
			System.out.println("Conta Inexistente");
			return true;
		}
		return false;
	}

	public boolean verificar(String id) {
		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getId().equals(id)) {
				System.out.println("Cliente já existe");
				return true;
			}
		}
		return false;
	}

	public void addCliente(String id) {
		if (verificar(id)) {
			System.out.println("Esse cliente já existe");
		} else {
			Cliente c1 = new Cliente(id);
			clientes.add(c1);
			ContaPoupanca cp = new ContaPoupanca(c1, contas.size());
			ContaCorrente cc = new ContaCorrente(c1, contas.size() + 1);
			contas.add(cp);
			contas.add(cc);
		}

	}

	public void update() {
		for (int i = 0; i < contas.size(); i++) {
			contas.get(i).update();
		}
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
