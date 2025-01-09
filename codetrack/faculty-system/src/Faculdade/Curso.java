package Faculdade;

import Faculdade.Exception.*;
import Fisico.Aluno;
import Fisico.Professor;

import java.util.HashMap;
import java.util.Map;

public class Curso extends MatriculaInvalidaException {
  private String nome;
  private Professor professorResponsavel;
  private Map<String, Aluno> mapAlunos;

  public Curso() {}

  public Curso(String nome, Professor professorResponsavel) {
    this.nome = nome;
    this.professorResponsavel = professorResponsavel;
    mapAlunos = new HashMap<>();
  }

  public void adicionarAluno(Aluno novoAluno) throws MatriculaInvalidaException {
    mapAlunos.put(novoAluno.getMatricula(), novoAluno);
  }

  public void removerAluno(String matricula){
    Aluno removeAluno = mapAlunos.get(matricula);
    if (removeAluno != null) {
      System.out.println("Aluno: " + removeAluno.getNome() + " removido com sucesso!");
      mapAlunos.remove(matricula);
    } else {
      System.out.println("Aluno não encontrado!");
    }
  }

  public void listaAlunos(){
    System.out.println("\n" + mapAlunos.toString() + "\n");
  }
  public String exibirDadosProfessor(){
    return this.professorResponsavel.exibirDados();
  }
  public boolean pesquisarMatricula(String matricula){
    return mapAlunos.containsKey(matricula);
  }

  public void setProfessorResponsavel(Professor professorResponsavel) {
    this.professorResponsavel = professorResponsavel;
  }
}
