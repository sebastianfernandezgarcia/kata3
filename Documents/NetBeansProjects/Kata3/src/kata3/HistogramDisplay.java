package kata3;


import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {
    
    public HistogramDisplay(String title) {
        super(title);
        this.setContentPane(this.createPanel());
        this.pack();
    }
    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataSet()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart( "Histogram FreeChart",
                                                        "Dominios emial",
                                                        "Números de Email",
                                                        dataSet,
                                                        PlotOrientation.VERTICAL,
                                                        false,
                                                        false,
                                                        rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataSet(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        dataSet.addValue(10, "", "ulpgc.es");
        dataSet.addValue(13, "", "icloud.es");
        dataSet.addValue(6, "", "ull.es");
        dataSet.addValue(9, "", "hotmail.com");
        dataSet.addValue(2, "", "gmail.com");
     
        return dataSet;
    }
    
    public void execute(){
        this.setVisible(true);
    }
}