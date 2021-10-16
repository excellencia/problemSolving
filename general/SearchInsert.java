package general;

import static java.lang.System.*;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {

        int left = 1;
        int right = nums.length;

        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target)
                return mid;
            else if(target < nums[mid])
                right = mid;
            else
                left = mid + 1;
        }
        return left;


    }

    public static void main(String[] args) {
        SearchInsert searchInsert = new SearchInsert();
        int[] nums = new int[]{1,3,5,7};
        int target = 4;
        out.println(searchInsert.searchInsert(nums,target));
    }
}
