package Faculdade.Exception;

public class MatriculaInvalidaException extends Exception {
  public MatriculaInvalidaException(){}
  public MatriculaInvalidaException(String errorMessage){
    super(errorMessage);
  }
}