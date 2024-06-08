import Faculdade.*;
import Faculdade.Exception.*;
import Fisico.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static Faculdade.Menu.*;

class Main {
  public static void main(String[] args) throws MatriculaInvalidaException, IOException {
    Map<Integer, Curso> cursos = new HashMap<>();
    Map<String, Funcionario> funcionarios = new HashMap<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int choise = -1, choiseCurso = -1;

    cursos.put(1, new Curso("ciencia da computação", new Professor("laercio", "93810499288", 43, 5500, "Tecnologia")));
    cursos.put(2, new Curso("engenharia da computação", new Professor("yuri", "999224412", 29, 4400, "Tecnologia")));
    cursos.put(3, new Curso("Tecnologia da informacao", new Professor("alex", "39480381", 32, 3900, "Tecnologia")));
    cursos.put(4, new Curso("seguranca da informacao", new Professor("bill", "9248390", 42, 6500, "Tecnologia")));
    cursos.put(5, new Curso("Psicologia", new Professor("sofia espanha", "3938291", 20, 12000, "Psicologia")));
    cursos.put(6, new Curso("Pedagogia", new Professor("yanka", "948948239489", 32, 7200, "Pedagocia")));

    while (choise != 0) {
      displayMenu();
      try {
        choise = Integer.parseInt(br.readLine());
        if (choise != 0 && choise != 6 && choise != 7 && choise != 8) {
          displayCursos();
          choiseCurso = Integer.parseInt(br.readLine());
        }
        switch (choise) {
          case 1:
            Aluno aluno = new Aluno();
            int i = 0;
            try {
              for (Curso curso : cursos.values()) {
                if (curso.pesquisarMatricula(aluno.getMatricula())) {
                  i++;
                }
              }
              if (i == 5) {
                throw new MatriculaInvalidaException("Matricula invalida: o aluno já esta matriculado em 5 cursos");
              } else {
                cursos.get(choiseCurso).adicionarAluno(aluno);
              }
            } catch (MatriculaInvalidaException e) {
              e.printStackTrace();
            }
            break;
          case 2:
            cursos.get(choiseCurso).listaAlunos();
            break;
          case 3:
            System.out.println("Digite a matricula do aluno que deseja remover: ");
            cursos.get(choiseCurso).removerAluno(br.readLine());
            break;
          case 4:
            System.out.println(cursos.get(choiseCurso).exibirDadosProfessor());
            break;
          case 5:
            Professor professor = new Professor();
            cursos.get(choiseCurso).setProfessorResponsavel(professor);
            break;
          case 6:
            Funcionario funcionario = new Funcionario();
            funcionarios.put(funcionario.getCpf(), funcionario);
            break;
          case 7:
            for (Funcionario func : funcionarios.values()) {
              System.out.println(func.exibirDados());
            }
            break;
          case 8:
            try {
              System.out.println("digite o cpf do funcionario: ");
              String cpf = br.readLine();
              if (!funcionarios.containsKey(cpf)) {
                throw new FuncionarioInvalidaException("Funcionario com CPF: " + cpf + " não encontrado");
              }
              funcionarios.remove(cpf);
              System.out.println("Funcionario removido com CPF: " + cpf);
            } catch (FuncionarioInvalidaException e) {
              e.printStackTrace();
            }
            break;
          case 0:
            System.out.println("finalizando o programar\n");
            break;
          default:
            System.out.println("opção invalido\n");
            break;
        }
      } catch (NumberFormatException e) {
        System.out.println("entrada invalida");
      } catch (Exception e) {
        System.out.println("Ocorreu um erro: " + e.getMessage());
        e.printStackTrace();
      }
    }
  }
}