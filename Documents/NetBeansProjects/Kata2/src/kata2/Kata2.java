package kata2;

import java.util.HashMap;
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
    






      //Versión 1
      /*  int[] data = {1,2,2,3,3,4,5,1,2,1,2,1,5,6,4};
        
        Map<Integer, Integer> histogram = new HashMap<>();
        
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
            }
            else
                histogram.put(data[i], 1);
        }
    
        System.out.println("---Mostramos el resultado---");
        
        if(!histogram.isEmpty()){
            for(Map.Entry<Integer, Integer> entry : histogram.entrySet()) { 
                System.out.println(entry.getKey() + " ==> " + entry.getValue());
            }
        }   


//====================
        //Version 2
        
       int[] data = {1,2,2,3,3,4,5,1,2,1,2,1,5,6,4};
        
       Map<Integer, Integer> histogram = new HashMap<>();
       
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key)+1 : 1);   
        } 
        System.out.println("---Mostramos el resultado---");
        
        if(!histogram.isEmpty()){
            for(Map.Entry<Integer, Integer> entry : histogram.entrySet()) { 
                System.out.println(entry.getKey() + " ==> " + entry.getValue());
            }
        }
    }


//====================
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


//==================

        
        //Version 4
        
       Integer[] data = {1,2,2,3,3,4,5,1,2,1,2,1,5,6,4};
       
        Histogram histo = new Histogram(data);
        
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        
        System.out.println("---Mostramos el resultado---");
        
        if(!histogr.isEmpty()){
            for(Map.Entry<Integer, Integer> entry : histogr.entrySet()) { 
                System.out.println(entry.getKey() + " ==> " + entry.getValue());
            }
        }
        */
        

