package main.java.plotting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;
import org.knowm.xchart.style.markers.SeriesMarkers;

public class PlottingData {
  public CategoryChart getChart() {
    CategoryChart chart =
        new CategoryChartBuilder()
            .width(800)
            .height(600)
            .title("Score Histogram")
            .xAxisTitle("Score")
            .yAxisTitle("Number")
            .build();

    chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
    chart.getStyler().setHasAnnotations(true);

    chart.addSeries("test 1", Arrays.asList(0, 1, 2, 3, 4), Arrays.asList(4, 5, 9, 6, 5));

    return chart;
  }

  public CategoryChart stickChart() {
    CategoryChart chart = new CategoryChartBuilder().width(800).height(600).title("Stick").build();

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

    return chart;
  }

  public XYChart graficoNaoUniforme() {
    List<Integer> xData = new ArrayList<Integer>();
    List<Double> yData = new ArrayList<Double>();

    // Tamanhos da lista correspondentes aos tempos (exemplo)
    int[] tamanhos = {100, 1000, 10000, 100000}; // Adicione mais tamanhos conforme necessário

    XYChart chart =
        new XYChartBuilder()
            .width(800)
            .height(600)
            .title("Comparação de Tempos - Lista Não Uniforme")
            .xAxisTitle("Tamanho da lista")
            .yAxisTitle("Tempo Médio (milissegundos)")
            .build();

    chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
    chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Line);
    chart.getStyler().setYAxisLabelAlignment(Styler.TextAlignment.Right);
    chart.getStyler().setYAxisDecimalPattern("#.## ms");
    chart.getStyler().setPlotMargin(0);
    chart.getStyler().setPlotContentSize(.95);

    List<Long> times = ColectionTime.colectionSearchTime();

    for (int i = 0; i < tamanhos.length; i++) {
      //TODO isso está apenas criando um grafico com o tempo de todos os algoritmos com uma lista de 100 valores
      //TODO crie um metodo para gerar uma lista de tempo para cada algoritmo individualmente e depois adicione ao yData e depois
      //TODO para o chart.addSeries()
      if (i < times.size()) { // Verifica se existe um tempo correspondente
        xData.add(tamanhos[i]); // Adiciona o tamanho da lista ao eixo X
        yData.add(times.get(i) / 1_000_000.0); // Converte nanosegundos para milissegundos
      }
    }

    chart.addSeries("Binary Search", xData, yData);
    chart.addSeries("Exponential Search", xData, yData);
    chart.addSeries("Interpolation Search", xData, yData);
    chart.addSeries("Jump Search", xData, yData);
    chart.addSeries("Ternary Search", xData, yData);
    return chart;
  }
}
