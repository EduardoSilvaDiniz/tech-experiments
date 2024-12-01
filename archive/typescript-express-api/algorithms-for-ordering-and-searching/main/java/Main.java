package main.java;

import main.java.plotting.PlottingData;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;

public class Main {
  public static void main(String[] args) {

    PlottingData exampleChart = new PlottingData();

    XYChart chartNotUniforme = exampleChart.graficoNaoUniforme();
    new SwingWrapper<XYChart>(chartNotUniforme).displayChart();
  }
}
