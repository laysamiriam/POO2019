import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Disciplina {
	protected String idDisciplina;
	Map<String, Aluno> malunos;

	public Disciplina(String idDisciplina) {
		super();
		this.idDisciplina = idDisciplina;
		malunos = new HashMap<String, Aluno>();

	}

	public void matricular(Aluno aluno) { 
		Aluno alu = malunos.get(aluno.getIdAluno());
		if (alu != null) {
			return;
		}
		malunos.put(aluno.idAluno, aluno);
		aluno.matricular(this);
	}

	public void desmatricular(String idAluno) {
		Aluno alu = malunos.get(idAluno);
		if (alu == null) {
			return;
		}
		malunos.remove(idAluno);
		alu.desmatricular(this.getIdDisciplina());
	}

	Collection<Aluno> getAlunos() {
		return malunos.values();
	}
	
	public String toString() {
		return getIdDisciplina();
	}

	
	public String getIdDisciplina() {
		return idDisciplina;
	}

}