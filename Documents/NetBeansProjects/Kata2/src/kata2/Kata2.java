package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        
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
}
    