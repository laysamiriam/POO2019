import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Aluno {
	protected String idAluno;
	Map<String, Disciplina> mdisciplinas;

	public Aluno(String idAluno) {
		super();
		this.idAluno = idAluno;
		mdisciplinas = new HashMap<String, Disciplina>();
	}

	public void matricular(Disciplina disciplina) {
		Disciplina disci = mdisciplinas.get(disciplina.idDisciplina);
		if (disci != null) {
			return;
		}
		mdisciplinas.put(disciplina.getIdDisciplina(), disciplina);
		disciplina.matricular(this);
	}

	public void desmatricular(String idDisciplina) {
		Disciplina disci = mdisciplinas.get(idDisciplina);
		if (disci == null) {
			return;
		}
		mdisciplinas.remove(idDisciplina);
		disci.desmatricular(this.getIdAluno());
	}

	Collection<Disciplina> getDisciplinas() {
		return mdisciplinas.values();
	}

	public String toString() {
		return getIdAluno();
	}
	
	public String getIdAluno() {
		return idAluno;
	}

}