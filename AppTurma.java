package aula22052020;

public class AppTurma {
	public static void main(String[] args) {
		Aluno regina = new Aluno("regina", "4544845-5");
        
		Turma turma = new Turma("ADS");
		turma.adicionarAluno(regina);
	}
}
