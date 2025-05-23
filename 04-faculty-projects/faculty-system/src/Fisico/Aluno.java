package Fisico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aluno extends Pessoa {
  private String matricula;

  public Aluno() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Digite o nome do aluno: ");
    String nome = br.readLine();

    System.out.println("digite cpf do aluno: ");
    String cpf = br.readLine();

    System.out.println("digite a idade do aluno: ");
    int idade = Integer.parseInt(br.readLine());

    System.out.println("digite matricula do aluno: ");
    String matricula = br.readLine();

    super(nome, cpf, idade);
    this.matricula = matricula;
  }

  @Override
  public String exibirDados() {
    return "Fisico.Aluno{" +
            "nome='" + nome + '\'' +
            ", cpf='" + cpf + '\'' +
            ", idade=" + idade + '\'' +
            ", matricula='" + matricula +
            '}';
  }

  public void realizarMatricula(String matricula, String curso){
    this.matricula = matricula;
  }

  public String getMatricula() {
    return matricula;
  }
}
