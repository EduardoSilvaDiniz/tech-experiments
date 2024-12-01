package main.java.plotting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;

public class PlottingData {
  public CategoryChart getChart() {

    // Create Chart
    CategoryChart chart =
        new CategoryChartBuilder()
            .width(800)
            .height(600)
            .title("Score Histogram")
            .xAxisTitle("Score")
            .yAxisTitle("Number")
            .build();

    // Customize Chart
    chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
    chart.getStyler().setHasAnnotations(true);

    // Series
    chart.addSeries(
        "test 1",
        Arrays.asList(0, 1, 2, 3, 4),
        Arrays.asList(4, 5, 9, 6, 5));

    return chart;
  }

  public CategoryChart stickChart() {

    // Create Chart
    CategoryChart chart = new CategoryChartBuilder().width(800).height(600).title("Stick").build();

    // Customize Chart
    chart.getStyler().setChartTitleVisible(true);
    chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
    chart.getStyler().setDefaultSeriesRenderStyle(CategorySeries.CategorySeriesRenderStyle.Stick);

    // Series
    List<Integer> xData = new ArrayList<Integer>();
    List<Integer> yData = new ArrayList<Integer>();
    for (int i = -3; i <= 24; i++) {
      xData.add(i);
      yData.add(i);
    }
    chart.addSeries("data", xData, yData);

    return chart;
  }

  public XYChart graficoUniforme() {
    List<Integer> xData = new ArrayList<Integer>();
    List<Double> yData = new ArrayList<Double>();

    XYChart chart =
        new XYChartBuilder()
            .width(800)
            .height(600)
            .title("Comparação de Tempos - Lista Uniforme")
            .xAxisTitle("Tamanho da lista")
            .yAxisTitle("Tempo Medio (segundos)")
            .build();

    chart.getStyler().setChartTitleVisible(true);
    chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
    chart.getStyler().setYAxisLogarithmic(true);
    chart.getStyler().setXAxisLabelRotation(45);

    chart.getStyler().setXAxisLabelAlignment(Styler.TextAlignment.Right);
    chart.getStyler().setXAxisLabelRotation(90);
    chart.getStyler().setXAxisLabelRotation(0);

    // Series
    for (int i = -3; i <= 10; i++) {
      xData.add(i);
      yData.add(Math.pow(10, i));
    }
    chart.addSeries("10^x", xData, yData);
    for (int i = -3; i <= 12; i++) {
      xData.add(i);
      yData.add(Math.pow(12, i));
    }
    chart.addSeries("12^x", xData, yData);
    for (int i = -3; i <= 14; i++) {
      xData.add(i);
      yData.add(Math.pow(14, i));
    }
    chart.addSeries("14^x", xData, yData);

    return chart;
  }
  public XYChart graficoNaoUniforme() {
    List<Integer> xData = new ArrayList<Integer>();
    List<Double> yData = new ArrayList<Double>();

    XYChart chart =
        new XYChartBuilder()
            .width(800)
            .height(600)
            .title("Comparação de Tempos - Lista Não Uniforme")
            .xAxisTitle("Tamanho da lista")
            .yAxisTitle("Tempo Medio (segundos)")
            .build();

    chart.getStyler().setChartTitleVisible(true);
    chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
    chart.getStyler().setYAxisLogarithmic(true);
    chart.getStyler().setXAxisLabelRotation(45);

    chart.getStyler().setXAxisLabelAlignment(Styler.TextAlignment.Right);
    chart.getStyler().setXAxisLabelRotation(90);
    chart.getStyler().setXAxisLabelRotation(0);

    List<Long> times = ColectionTime.colectionSearchTime();
    for (int i = 0; i <= times.size()-1; i++) {
      xData.add(Math.toIntExact(times.get(i)));
      yData.add((double) Math.toIntExact(times.get(i)));
    }
    chart.addSeries("Binary Search", xData, yData);
    return chart;
  }

  public static void main(String[] args) {
    PlottingData exampleChart = new PlottingData();

    XYChart chartUniforme = exampleChart.graficoUniforme();
    XYChart chartNotUniforme = exampleChart.graficoNaoUniforme();
    new SwingWrapper<XYChart>(chartUniforme).displayChart();
    new SwingWrapper<XYChart>(chartNotUniforme).displayChart();
  }
}
