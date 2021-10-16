package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> stockPrice = new HashMap<>();

        stockPrice.put("Oracle", 56);
        stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);
        stockPrice.put("Google", 421);
        stockPrice.put("Ford", 456);
        stockPrice.put("Novartis", 43);
        stockPrice.put("TCS", 23);
        int max = 0;
        String stock = "";

        for (Map.Entry<String, Integer> entry : stockPrice.entrySet()) {
            if (entry.getValue() > max) {
                stock = entry.getKey();
                max = entry.getValue();
            }
        }

        System.out.println(stock);

        int avgPrice = 0;
        int sum = 0;
        for (Map.Entry<String, Integer> entry : stockPrice.entrySet()) {
            sum += entry.getValue();
        }
        avgPrice = sum / stockPrice.size();
        System.out.println(avgPrice);

        Iterator<Map.Entry<String, Integer>> itr = stockPrice.entrySet().iterator();

        while (itr.hasNext()){

            if(itr.next().getValue() < 50){
                itr.remove();
            }
        }
        System.out.println(stockPrice);

    }
}
