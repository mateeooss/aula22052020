package aula22052020;

public class Aluno {
  private String nome;
  private String ra;

  public void aluno(String nome, String ra) {
	 this.nome=nome;
	 this.ra=ra;
  }
  public String getNome() {
	 return this.nome;
  }
  public String getRg() {
	 return this.ra;
  }
}
