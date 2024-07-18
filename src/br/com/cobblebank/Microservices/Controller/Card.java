package br.com.cobblebank.Microservices.Controller;

import java.io.Serializable;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.stream.Collectors;

//TODO Converter a classe CARD para uma interface
public class Card implements Serializable {
  private int[] cardNumbers = new int[16];
  private int[] secureNumbers = new int[3];
  private int limite;
  private String expirationData;
  enum functions { CREDIT, DEBIT }
  private EnumSet<functions> functionsCard;

  public Card(functions function) {
    this.cardNumbers = Tools.genCardNumbers();
    this.expirationData = Tools.genExpirationData();
    this.secureNumbers = Tools.genSecureNumbers();
    functionsCard = EnumSet.noneOf(functions.class);
    functionsCard.add(function);
  }

  public EnumSet<functions> getFunctionsCard() {
    return functionsCard;
  }

  public void setFunctionsCard(EnumSet<functions> functionsCard) {
    this.functionsCard = functionsCard;
  }

  public String getSecureNumbers() {
    return Arrays.stream(secureNumbers)
            .mapToObj(Integer::toString)
            .collect(Collectors.joining(""));
  }

  public String getCardNumbers() {
    return Arrays.stream(cardNumbers)
            .mapToObj(Integer::toString)
            .collect(Collectors.joining(""));
  }
}