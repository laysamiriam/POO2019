import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.management.RuntimeErrorException;

public class Mapa {
	HashMap <String, String> map = new HashMap();
	
	public void adicionar(String key, String frase) {
		map.put(key, frase);
	}
	public void remover(String frase) {
		int cont=0;
		for(Map.Entry<String, String> procura: map.entrySet()) {
			if(procura.getValue().equals(frase) || procura.getKey().equals(frase)) {
				cont++;
				map.remove(procura.getKey());
			}
		}if(cont==0) {
			throw new RuntimeException("Valor não encontrado");
		}
	}
	
	public void listar() {
		for(Map.Entry<String, String> procura: map.entrySet()) {
			System.out.println(procura.getKey() + " :  " + procura.getValue());
		}
	}
	
	public void obter() {
		
	}
	public Map<String, String> getMap() {
		return map;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + this.getMap();
	}
}
