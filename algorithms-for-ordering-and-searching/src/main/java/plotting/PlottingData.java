package main.java.plotting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;

public class PlottingData {
  private final List<Integer> sizeList = Arrays.asList(1000, 3000, 6000, 8000, 10000);
  private final List<String> algorithms =
      Arrays.asList(
          "BinarySearch",
          "ExponentialSearch",
          "InterpolationSearch",
          "JumpSearch",
          "TernarySearch");

  public XYChart chartAlgorithmsCompletionTime() {
    XYChart chart =
        new XYChartBuilder()
            .width(800)
            .height(600)
            .title("Comparação de tempo de exeucação - Lista 1.000 ... 10.000 elementos")
            .xAxisTitle("Tamanho da Lista")
            .yAxisTitle("Tempo Médio (milissegundos)")
            .build();

    chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNE);
    chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Line);
    chart.getStyler().setYAxisDecimalPattern("#.## ms");
    chart.getStyler().setPlotMargin(0);
    chart.getStyler().setPlotContentSize(.95);

    HashMap<String, List<Long>> executionTimes = ColectionTime.colectionSearchTime();

    for (String algorithm : algorithms) {
      List<Long> times = executionTimes.get(algorithm);
      if (times != null) {
        List<Double> yData = times.stream().map(time -> time / 1_000_000.0).toList();
        chart.addSeries(algorithm, sizeList, yData);
      }
    }
    return chart;
  }
}
