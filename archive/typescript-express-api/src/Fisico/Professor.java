package Fisico;

public class Professor extends Pessoa{
  private int quantidadeDeAulaDada;
  private double salario;
  private String disciplina;

  public Professor() {}

  public Professor(String nome, String cpf, int idade, int salario, String disciplina) {
    super(nome, cpf, idade);
    this.salario = salario;
    this.disciplina = disciplina;
  }

  public void darAula(int quantidadeDeAulaDada){
    this.quantidadeDeAulaDada = quantidadeDeAulaDada;
  }

  @Override
  public String exibirDados() {
    return "Fisico.Professor{" +
            "nome='" + nome + '\'' +
            ", cpf='" + cpf + '\'' +
            ", idade=" + idade +
            ", salario=" + salario +
            ", quantidadeDeAulaDada=" + quantidadeDeAulaDada +
            ", disciplina='" + disciplina + '\'' +
            '}';
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(int salario) {
    this.salario = salario;
  }

  public int getQuantidadeDeAulaDada() {
    return quantidadeDeAulaDada;
  }

  public void setQuantidadeDeAulaDada(int quantidadeDeAulaDada) {
    this.quantidadeDeAulaDada = quantidadeDeAulaDada;
  }

  public String getDisciplina() {
    return disciplina;
  }

  public void setDisciplina(String disciplina) {
    this.disciplina = disciplina;
  }
}
