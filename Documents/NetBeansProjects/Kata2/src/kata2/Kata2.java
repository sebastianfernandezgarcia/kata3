package kata2;

import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        
        //Version 5
        
       String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};

        Histogram histo = new Histogram(data);
        
        Map<String, Integer> histogr = histo.getHistogram();
        
        
        System.out.println("---Mostramos el resultado---");
        
        if(!histogr.isEmpty()){
            for(Map.Entry<String, Integer> entry : histogr.entrySet()) { 
                System.out.println(entry.getKey() + " ==> " + entry.getValue());
            }
        }
    }
}
    
