package general;

import java.util.Arrays;

public class ThreeSumSmaller {

    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int counter = 0;

        for(int i = 0; i < nums.length - 2;++i){
            counter+= twoSumSmaller(nums,i+1,target-nums[i]);
        }
        return counter;
    }

    int twoSumSmaller(int[] nums, int startIndex, int target){
        int sum = 0;
        int l = startIndex, r = nums.length-1;
        while(l < r){
            if(nums[l]+nums[r] < target){
                sum += r - l;
                l++;
            }
            else
                r--;

        }
        return sum;
    }

    public static void main(String[] args) {
        ThreeSumSmaller sumSmaller = new ThreeSumSmaller();
        System.out.println(sumSmaller.threeSumSmaller(new int[]{-2,0,1,3},2));
    }
}
