package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        list =  list.stream().map(i -> i*i).sorted().collect(Collectors.toList());
        int[] array = list.stream().mapToInt(i->i).toArray();
        return array;
    }
    public int[] sortedSquaresTwoPointer(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int[] result = new int[n];
        for(int i = n - 1; i >= 0; i--){
            int square;
            if(Math.abs(nums[left]) < Math.abs(nums[right])){
                square = nums[right];
                right--;
            }
            else{
                square = nums[left];
                left++;
            }
            result[i] = square*square;
        }
        return result;
    }

    public static void main(String[] args) {
        SquaresOfSortedArray squaresOfSortedArray = new SquaresOfSortedArray();
        int[] nums = new int[]{-4,-1,0,3,10};
        nums = squaresOfSortedArray.sortedSquaresTwoPointer(nums);
        Arrays.stream(nums).map(i -> i).forEach(System.out::println);
    }
}
