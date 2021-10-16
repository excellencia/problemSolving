package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysDemo {

    public static void main(String args[]) {

        int[] numbers = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };

        int index = Arrays.binarySearch(numbers, 4);

        System.out.println("The index of element 4 in the array is " + index);

    }

    public static void parallelSortExample(int[] arr){
        Arrays.parallelSort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    static void frequency(){
        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(9);
        list.add(75);
        System.out.println("Total number of times,9 is present in the List is: " + Collections.frequency(list, 9));

    }
}
