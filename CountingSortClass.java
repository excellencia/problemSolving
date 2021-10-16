package general;

import java.util.ArrayList;
import java.util.List;

public class CountingSortClass {
    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> result = new ArrayList<Integer>();
        int[] frequency = new int[100];
        for(Integer each: arr)
            frequency[each] += 1;
        for(int each : frequency)
            result.add(each);
        return result;

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(99);
        list.add(8);
        list.add(80);
        list.add(67);
        list.add(4);
        list.add(56);
        list.add(34);
        list.add(76);
        list.add(90);

        System.out.println(countingSort(list));
    }

}
