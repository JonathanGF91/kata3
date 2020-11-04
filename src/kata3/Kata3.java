package kata3;

/**
 *
 * @author Jonathan
 */
public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram();
        
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.es");
        histogram.increment("outlook.es");
        histogram.increment("outlook.es");
        histogram.increment("outlook.es");
        histogram.increment("gmail.es");
        
        HistogramDisplay histogramDis = new HistogramDisplay("Histogram 1", histogram);
        histogramDis.Execute();
    }
    
}
