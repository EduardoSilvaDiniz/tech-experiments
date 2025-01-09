package Fisico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Funcionario extends Pessoa{
  private String cargo, setor, tarefaExecutar;

  public Funcionario() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Digite o nome do funcionario: ");
    String nome = br.readLine();

    System.out.println("digite cpf do funcionario: ");
    String cpf = br.readLine();

    System.out.println("digite a idade do funcionario: ");
    int idade = Integer.parseInt(br.readLine());

    super(nome, cpf, idade);

    System.out.println("digite o cargo do funcionario: ");
    this.cargo = br.readLine();

    System.out.println("digite o setor do funcionario: ");
    this.setor = br.readLine();

    System.out.println("digite a tarefa a executar do funcionario: ");
    this.tarefaExecutar = br.readLine();
  }

  public Funcionario(String nome, String cpf, int idade, String cargo, String setor, String tarefaExecutar) {
    super(nome, cpf, idade);
    this.cargo = cargo;
    this.setor = setor;
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
  public void executarTarefa(String tarefaExecutar){
    this.tarefaExecutar = tarefaExecutar;
  }
}
