package general;

import java.util.Arrays;

public class SearchInRotatedArray {
    public int search(int[] nums, int target) {
        int smallest = Integer.MAX_VALUE;
        if(nums.length == 0)
            return -1;
        if(nums.length == 1 && nums[0] == target)
            return 0;
        int pivot = 0;
        int start = 0;
        int end = nums.length - 1;
        int mid1 = -1;
        int mid2 = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < smallest){
                smallest = nums[i];
                pivot = i;
            }
        }
        System.out.println(pivot);
        if(pivot < nums.length){
            mid1 = binarySearch(nums,pivot,end,target);
            mid2 = binarySearch(nums,start,pivot-1,target);
        }
        if(mid1 == -1)
            return mid2;
        else
            return mid1;

    }

    public int binarySearch(int[] nums, int start, int end, int target) {
        if (end >= start) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                return binarySearch(nums, mid + 1, end, target);
            else
                return binarySearch(nums, start, mid - 1, target);
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchInRotatedArray search = new SearchInRotatedArray();
        System.out.println(search.search(new int[] {3,1},1));
    }
}
