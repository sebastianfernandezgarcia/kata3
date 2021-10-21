package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        
        histogram.increment("icloud.com");
        histogram.increment("icloud.com");
        histogram.increment("icloud.com");
        histogram.increment("icloud.com");
        
        histogram.increment("gmail.com");
        
        HistogramDisplay histo = new HistogramDisplay("Histograma", histogram);
        histo.execute();
    }
    
}
