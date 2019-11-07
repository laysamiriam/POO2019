import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Repositorio<Aluno> repoalu = new Repositorio<Aluno>("Aluno");
		Repositorio<Disciplina> repodis = new Repositorio<Disciplina>("Disciplina");

		Scanner opcao = new Scanner(System.in);

		while (true) {
			System.out.println("addalu(nome) | adddis(nome) | matricular(nome,disciplina) | desmatricular (nome,disciplina) | remover (nome) | show");
			String op = opcao.nextLine();
			String[] vet = op.split(" ");

			try {
				if (vet[0].equalsIgnoreCase("end")) { 
					break;
				} else if (vet[0].equals("addalu")) {
					for (int i = 1; i < vet.length; i++)
						repoalu.add(vet[i], new Aluno(vet[i]));

				} else if (vet[0].equals("adddis")) {
					for (int i = 1; i < vet.length; i++)
						repodis.add(vet[i], new Disciplina(vet[i]));

				} else if (vet[0].equals("matricular")) {
					for (int i = 2; i < vet.length; i++)
						repoalu.get(vet[1]).matricular(repodis.get(vet[i]));

				} else if (vet[0].equals("desmatricular")) {
					for (int i = 2; i < vet.length; i++) {
						repoalu.get(vet[1]).desmatricular(repodis.get(vet[i]).getIdDisciplina());
					}	
				} else if (vet[0].equals("show")) {
					System.out.println("Alunos: ");
					for (Aluno aluno : repoalu.getAll()) {
						System.out.println(" " + aluno.getIdAluno() + aluno.getDisciplinas());
					}
					System.out.println("Disciplinas: ");
					for (Disciplina disciplina : repodis.getAll()) {
						System.out.println(" " + disciplina.getIdDisciplina() + disciplina.getAlunos());
					}
				}
				else if(vet[0].equals("remover")) { 
					Aluno alu = repoalu.get(vet[1]);
					for(Disciplina disciplina : alu.getDisciplinas()) { //Deus é mais
						alu.desmatricular(disciplina.getIdDisciplina());
					}
					repoalu.remover(vet[1]);
				}else {
					System.out.println("Não entendi. Digite novamente!");
				}
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Você esqueceu um parâmetro");
			}catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
