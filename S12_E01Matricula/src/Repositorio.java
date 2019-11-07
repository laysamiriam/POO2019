import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Repositorio <T>{
	protected String nome;
	Map<String, T> mapa;
	
	public Repositorio(String nome) {
		super();
		this.nome = nome;
		mapa = new HashMap<String, T>();
	}

	public void add(String key, T data) {
		T t = mapa.get(key);
		if(t == null)
			mapa.put(key, data);
		else
			throw new RuntimeException(nome + " " + key + " ja existe");
	}
	
	public void remover(String key) {
		T t = mapa.get(key);
		if(t != null)
			mapa.remove(key);
		else
			throw new RuntimeException(nome + " " + key + " não existe");
	}
	
	public T get(String key) {
		T t = mapa.get(key);
		if(t == null)
			throw new RuntimeException(nome + " " + key + " nao existe");
		return t;
	}
	
	@Override
	public String toString() {
		return "" + mapa;
	}
	
	Collection<T> getAll() {
		return mapa.values();
	}
		
}
