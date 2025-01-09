package br.com.cobblebank.Microservices.Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {

  public void tryConnect(String ip, String user, String pass){
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection(ip, user, pass);
      System.out.println("conexao com sucesso");
    } catch (Exception ex) {
      throw new RuntimeException(ex.getMessage());
    }
  }
}
