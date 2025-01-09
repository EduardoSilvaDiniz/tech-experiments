package Fisico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Professor extends Pessoa{
  private int quantidadeDeAulaDada;
  private double salario;
  private String disciplina;

  public Professor(String nome, String cpf, int idade, int salario, String disciplina) {
    super(nome, cpf, idade);
    this.salario = salario;
    this.disciplina = disciplina;
  }

  public Professor() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Digite o nome do professor: ");
    String nome = br.readLine();

    System.out.println("digite cpf do professor: ");
    String cpf = br.readLine();

    System.out.println("digite a idade do professor: ");
    int idade = Integer.parseInt(br.readLine());

    super(nome, cpf, idade);

    System.out.println("digite salario do professor: ");
    this.salario = Integer.parseInt(br.readLine());

    System.out.println("digite disciplina do professor: ");
    this.disciplina = br.readLine();
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

  public void darAula(int quantidadeDeAulaDada){
    this.quantidadeDeAulaDada = quantidadeDeAulaDada+1;
  }

  public String getDisciplina() {
    return disciplina;
  }

  public void setDisciplina(String disciplina) {
    this.disciplina = disciplina;
  }
}
