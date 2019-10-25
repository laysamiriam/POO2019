import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import javax.management.RuntimeErrorException;

public class Sistema {
	int nextId = 0;
	Map<String, Cliente> clientes;
	Map<Integer, Transacao> transacoes;
	protected double saldoag;

	public Sistema(double saldoinicial) {
		super();
		clientes = new TreeMap<String, Cliente>();
		transacoes = new TreeMap<Integer, Transacao>();
		this.saldoag = saldoinicial;
	}

	public boolean checar(String key) {
		Cliente cli = clientes.get(key);
		if (cli == null) {
			return true;
		} else {
			return false;
		}
	}

	public void addCli(Cliente cliente) {
		if (checar(cliente.getIdCliente())) {
			clientes.put(cliente.getIdCliente(), cliente);
		} else {
			throw new RuntimeException("Cliente " + cliente.getIdCliente() + " já existe");
		}
	}

	public void emprestar(String key, double valor) {
		if (checar(key))
			throw new RuntimeException("Cliente não existe");
		else {
			if(valor>0) {
				if (this.getSaldoag() >= valor) {
					clientes.get(key).transacoes.put(nextId, new Transacao(nextId, key, valor));
					transacoes.put(nextId, new Transacao(nextId, key, valor));
					clientes.get(key).setSaldo(clientes.get(key).getSaldo() + valor);
					this.setSaldoag(this.getSaldoag() - valor);
					nextId++;
				} else {
					throw new RuntimeException("O agiota está liso");
				}
			}else {
				throw new RuntimeException("Você não pode emprestar valores negativos");
			}
			
		}
	}

	public void resumo() {
		for (String key : clientes.keySet()) {
			System.out.println(clientes.get(key).getIdCliente() + " : " + clientes.get(key).getNomeComp() + " : "
					+ clientes.get(key).getSaldo());
		}
		System.out.println("Saldo: " + this.getSaldoag());
	}

	public void historico() {
		for (int id : this.transacoes.keySet()) {
			System.out.println(transacoes.get(id));
		}
	}

	public void filtrar(String key) {
		if (checar(key)) {
			throw new RuntimeException("Cliente inexistente");
		} else {
			for (int id : this.transacoes.keySet()) {
				if (transacoes.get(id).getIdCliente().equals(key)) {
					System.out.print(this.transacoes.get(id) + "\n");
				}
			}
			System.out.println("Saldo: " + clientes.get(key).getSaldo());
		}
	}

	public void receber(String key, double valor) {
		if (checar(key)) {
			throw new RuntimeException("Cliente inexistente");
		} else {
			if (valor > clientes.get(key).getSaldo()) {
				throw new RuntimeException("Valor maior que a dívida");
			} else {
				clientes.get(key).transacoes.put(nextId, new Transacao(nextId, key, -valor));
				transacoes.put(nextId, new Transacao(nextId, key, -valor));
				clientes.get(key).setSaldo(clientes.get(key).getSaldo() - valor);
				this.setSaldoag(this.getSaldoag() + valor);
				nextId++;
			}
		}
	}

	public void matar(String key) {
		if (checar(key)) {
			throw new RuntimeException("Cliente inexistente");
		} else {
			for (int i = transacoes.size()-1; i >= 0; i--) { //Professor, o senhor não teve piedade nessa linha de código
				if (transacoes.get(i).getIdCliente().equals(key)) {
					transacoes.remove(i);
				}
				clientes.remove(key);
			}

		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + this.getClientes() + this.getTransacoes() + this.getSaldoag();
	}

	public double getSaldoag() {
		return saldoag;
	}

	public void setSaldoag(double saldoag) {
		this.saldoag = saldoag;
	}

	public Map<String, Cliente> getClientes() {
		return clientes;
	}

	public Map<Integer, Transacao> getTransacoes() {
		return transacoes;
	}

}
