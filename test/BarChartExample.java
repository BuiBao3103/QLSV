
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.Color;
import java.awt.Paint;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.CategoryItemRenderer;

public class BarChartExample {

    public static void main(String[] args) {
        // Create dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(120, "Profit", "Jan");
        dataset.addValue(240, "Profit", "Feb");
        dataset.addValue(180, "Profit", "Mar");
        dataset.addValue(90, "Profit", "Apr");

        // Create bar chart
        JFreeChart chart = ChartFactory.createBarChart(
                "Monthly Profit", // chart title
                "Month", // domain axis label
                "Profit", // range axis label
                dataset, // data
                PlotOrientation.VERTICAL, // orientation
                true, // include legend
                true, // tooltips
                false // URLs
        );

        final CategoryPlot plot = chart.getCategoryPlot();
        plot.setNoDataMessage("NO DATA!");

        final CategoryItemRenderer renderer = new BarRenderer();
        plot.setRenderer(renderer);

        // Display the chart
        ChartFrame frame = new ChartFrame("Bar Chart Example", chart);
        frame.pack();
        frame.setVisible(true);
    }
}
