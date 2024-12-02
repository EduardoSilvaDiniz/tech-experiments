package main.java.plotting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;

public class PlottingData {
  private final List<Integer> sizeList = Arrays.asList(100, 1000, 10000);
  List<String> algorithms =
      Arrays.asList(
          "BinarySearch",
          "ExponentialSearch",
          "InterpolationSearch",
          "JumpSearch",
          "TernarySearch");

  public XYChart graficoNaoUniforme() {
    List<Integer> xData = new ArrayList<Integer>();
    List<Double> yData = new ArrayList<Double>();

    XYChart chart =
        new XYChartBuilder()
            .width(800)
            .height(600)
            .title("Matlab Theme")
            .xAxisTitle("Tamanho da Lista")
            .yAxisTitle("Tempo Medio")
            .build();

    // Customize Chart
    chart.getStyler().setPlotGridLinesVisible(false);
    chart.getStyler().setXAxisTickMarkSpacingHint(100);
    // XYChart chart =
    //    new XYChartBuilder()
    //        .width(800)
    //        .height(600)
    //        .title("Comparação de Tempos - Lista de 100...10.000")
    //        .xAxisTitle("Tamanho da lista")
    //        .yAxisTitle("Tempo Médio (milissegundos)")
    //        .build();

    chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
    chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Line);
    chart.getStyler().setYAxisLabelAlignment(Styler.TextAlignment.Left);
    chart.getStyler().setYAxisDecimalPattern("#.## ms");
    chart.getStyler().setPlotMargin(0);
    chart.getStyler().setPlotContentSize(.95);

    HashMap<String, List<Long>> executationTimes = ColectionTime.colectionSearchTime();

    for (String algorithm : algorithms) {
      for (int i = 0; i < sizeList.size(); i++) {
        xData.add(sizeList.get(i));
        yData.add(executationTimes.get(algorithm).get(i) / 1000000.0);
        System.out.println(
            algorithm
                + " X: "
                + sizeList.get(i)
                + " Y: "
                + executationTimes.get(algorithm).get(i) / 1000000.0);
      }
      chart.addSeries(algorithm, xData, yData);
    }
    return chart;
  }
}
