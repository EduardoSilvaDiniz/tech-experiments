import Faculdade.*;
import Faculdade.Exception.*;
import Fisico.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import static Faculdade.Menu.*;

class Main {
  public static void main(String[] args) throws MatriculaInvalidaException, IOException {
    Map<Integer, Curso> cursos = new HashMap<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int choise = -1, choiseCurso = -1;

    cursos.put(1, new Curso("ciencia da computação", new Professor("laercio", "93810499288", 43, 5500, "Tecnologia")));
    cursos.put(2, new Curso("engenharia da computação", new Professor("yuri", "999224412", 29, 4400, "Tecnologia")));
    cursos.put(3, new Curso("Tecnologia da informacao", new Professor("alex", "39480381", 32, 3900, "Tecnologia")));
    cursos.put(4, new Curso("seguranca da informacao", new Professor("bill", "9248390", 42, 6500, "Tecnologia")));
    cursos.put(5, new Curso("Psicologia", new Professor("sofia espanha", "3938291", 20, 12000, "Pedagocia")));
    cursos.put(6, new Curso("Pedagogia", new Professor("yanka", "948948239489", 32, 7200, "Pedagocia")));

    while (choise != 0) {
      choise = -1; choiseCurso = -1;
      displayMenu();
      choise = Integer.parseInt(br.readLine());

      if (choise != 0) {
        displayCursos();
        choiseCurso = Integer.parseInt(br.readLine());
      }

      switch (choise) {
        case 1:
          cursos.get(choiseCurso).adicionarAluno(new Aluno());
          break;
        case 2:
          cursos.get(choiseCurso).listaAlunos();
          break;
        case 3:
          System.out.println("Digite a matricula do aluno que deseja remover: ");
          String matricula = br.readLine();
          cursos.get(choiseCurso).removerAluno(matricula);
          break;
        case 4:
          System.out.println(cursos.get(choiseCurso).exibirDadosProfessor());
          break;
        case 0:
          System.out.println("finalizando o programar\n");
          break;
        default:
          System.out.println("opção invalido\n");
          break;
      }
    }
  }
}