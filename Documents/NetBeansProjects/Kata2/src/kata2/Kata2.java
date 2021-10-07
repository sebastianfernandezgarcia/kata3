package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        
        //Version 3
        
       int[] data = {1,2,2,3,3,4,5,1,2,1,2,1,5,6,4};
       
        Histogram histo = new Histogram(data);
        
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        
        System.out.println("---Mostramos el resultado---");
        
        if(!histogr.isEmpty()){
            for(Map.Entry<Integer, Integer> entry : histogr.entrySet()) { 
                System.out.println(entry.getKey() + " ==> " + entry.getValue());
            }
        }
    }
}
    
