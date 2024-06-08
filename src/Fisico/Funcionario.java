package Fisico;

public class Funcionario extends Pessoa{
  private String cargo, setor, tarefaExecutar;

  public Funcionario() {}

  public Funcionario(String nome, String cpf, int idade, String cargo, String setor, String tarefaExecutar) {
    super(nome, cpf, idade);
    this.cargo = cargo;
    this.setor = setor;
    this.tarefaExecutar = tarefaExecutar;
  }

  public void executarTarefa(String tarefaExecutar){
    this.tarefaExecutar = tarefaExecutar;
  }

  @Override
  public String exibirDados() {
    return "Fisico.Funcionario{" +
            "cargo='" + cargo + '\'' +
            ", setor='" + setor + '\'' +
            ", tarefaExecutar='" + tarefaExecutar + '\'' +
            ", nome='" + nome + '\'' +
            ", cpf='" + cpf + '\'' +
            ", idade=" + idade +
            '}';
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public String getSetor() {
    return setor;
  }

  public void setSetor(String setor) {
    this.setor = setor;
  }

  public String getTarefaExecutar() {
    return tarefaExecutar;
  }

  public void setTarefaExecutar(String tarefaExecutar) {
    this.tarefaExecutar = tarefaExecutar;
  }
}
