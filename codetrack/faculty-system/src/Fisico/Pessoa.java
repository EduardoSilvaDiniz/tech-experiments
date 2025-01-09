package Fisico;

public abstract class Pessoa {
  protected String nome;
  protected String cpf;
  protected int idade;

  public Pessoa() {}

  public Pessoa(String nome, String cpf, int idade) {
    this.nome = nome;
    this.cpf = cpf;
    this.idade = idade;
  }

  public String exibirDados() {
    return "Fisico.Pessoa{" +
            "nome='" + nome + '\'' +
            ", cpf='" + cpf + '\'' +
            ", idade=" + idade +
            '}';
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

}
