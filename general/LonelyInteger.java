package general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {
    public static int lonelyInteger(List<Integer> a) {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer num : a){
                map.put(num, map.getOrDefault(num, 0)+1);
            }
        System.out.println(map);
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(2);
        integerList.add(1);
        integerList.add(4);
        integerList.add(2);
        System.out.println(lonelyInteger(integerList));;
    }

}
