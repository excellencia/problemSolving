package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*
Problem:
        Given an integer array nums, return all the triplets
        [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
        and nums[i] + nums[j] + nums[k] == 0.
        Notice that the solution set must not contain duplicate triplets.

Algo:
        1. For the main function:

            Sort the input array nums.
            Iterate through the array:
            If the current value is greater than zero, break from the loop. Remaining values cannot sum to zero.
            If the current value is the same as the one before, skip it.
            Otherwise, call twoSumII for the current position i.
            For twoSumII function:

        2. Set the low pointer lo to i + 1, and high pointer hi to the last index.
            While low pointer is smaller than high:
            If sum of nums[i] + nums[lo] + nums[hi] is less than zero, increment lo.
            If sum is greater than zero, decrement hi.
            Otherwise, we found a triplet:
            Add it to the result res.
            Decrement hi and increment lo.
            Increment lo while the next value is the same as before to avoid duplicates in the result.
        3. Return the result res.
*/

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length && nums[i] <= 0; ++i) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSumII(nums, i, res);
                //twoSum(nums, i, res);
            }
        }

        return res;
    }

    private void twoSumII(int[] nums, int i, List<List<Integer>> res) {
        int l = i + 1;
        int r = nums.length - 1;
        while(l < r){
            if(nums[i]+nums[l]+nums[r] < 0)
                l++;
            else if(nums[i]+nums[l]+nums[r] > 0)
                r--;
            else{
                res.add(Arrays.asList(nums[i],nums[l++],nums[r--]));
                while(l < r && nums[l - 1] == nums[l])
                    ++l;
            }
        }
    }
/*  For each index j > i in A:
        Compute complement value as -nums[i] - nums[j].
        If complement exists in hashset seen:
        We found a triplet - add it to the result res.
        Increment j while the next value is the same as before to avoid duplicates in the result.
        Add nums[j] to hashset seen
    */
    private void twoSum(int[] nums, int i, List<List<Integer>> res){

        HashSet<Integer> seen = new HashSet<Integer>();

        for(int j = i + 1; j < nums.length; ++j){
            int complement = -nums[i] - nums[j];
            if(seen.contains(complement)){
                res.add(Arrays.asList(nums[i],nums[j],complement));
                while (j + 1 < nums.length && nums[j + 1] == nums[j])
                    j++;
            }
            seen.add(nums[j]);
        }
    }

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        System.out.println(threeSum.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
