package Faculdade;

public class Menu {
  public static void displayMenu() {
    System.out.println (
      "\nMenu da Faculdade\n" +
      "1. adicionar aluno ao curso\n" +
      "2. mostrar alunos que estao matriculados no curso\n" +
      "3. remover aluno do curso\n" +
      "0. sair do programar\n" +
      "digite uma opção: "
    );
  }
  public static void displayCursos() {
    System.out.println (
      "\nEm qual curso ?\n" +
      "1. Ciencia da computação\n" +
      "2. Engenharia da computação\n" +
      "3. Tecnologia da informação\n" +
      "4. Segurança da informação\n" +
      "5. Psicologia\n" +
      "6. Pedagocia\n" +
      "Escolha um valor: "
    );
  }
}
