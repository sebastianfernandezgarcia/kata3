package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        
        int[] data = {1,2,2,3,3,4,5,1,2,1,2,1,5,6,4};
        
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
            for(Map.Entry<Integer, Integer> entry : histogram.entrySet()) { //histogram.entrySet().forEach((entry) -> {
                System.out.println(entry.getKey() + " ==> " + entry.getValue());
            }
        }   
        
    }
}

    