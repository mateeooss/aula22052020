package aula22052020;

import java.util.HashSet;

public class turma {
  private String codigo;
  private Aluno lider;
  private HashSet<Aluno> alunos;
  
public void contrutorTurma(String codigo) {
	this.codigo=codigo;
}
public String getCodigo() {
	
  return this.codigo;
}
public void adicionarAluno(Aluno aluno) {
	alunos.add(aluno);
}
public HashSet<Aluno> getAlunos() {
	return alunos;
}
public void setLider(Aluno lider) {
	this.lider=lider;
}
public Aluno getLider(){
	return lider;
}
}
