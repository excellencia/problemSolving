package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletZeroSum {
//    public List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        System.out.println("Array: "+nums.toString());
//        List<List<Integer>> output = new ArrayList<List<Integer>>();
//        List<Integer> preout = new ArrayList<Integer>();
//        int n = nums.length;
//        for (int i = 0; i < n - 2; i++) {
//            int l = i + 1;
//            int r = n - 1;
//            int x = nums[i];
//            while (l < r) {
//                if (x + nums[l] + nums[r] == 0) {
//                    System.out.println("X: "+x);
//                    System.out.println("L: "+nums[l]);
//                    System.out.println("R: "+nums[r]);
//                    preout.add(x);
//                    preout.add(nums[l]);
//                    preout.add(nums[r]);
//                    output.add(preout);
//                    l++;
//                    r--;
//                } else if (x + nums[l] + nums[r] < 0)
//                    l++;
//                else
//                    r--;
//            }
//        }
//        return output;
    //}


    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        // [-1,0,1,2,-1,-4]
        //[-1,-1,0,1,2,-4]
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<nums.length-2; i++) {
            if(i ==0 || (i>0 && nums[i] != nums[i-1])) {
                int sum = 0 - nums[i];
                int left = i+1;
                int right = nums.length-1;

                while(left < right) {
                    if(nums[left] + nums[right] == sum) {
                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                        while(left < right && nums[left] == nums[left+1]) {
                            left++;
                        }

                        while(left < right && nums[right] == nums[right-1]) {
                            right--;
                        }

                        left++;
                        right--;
                    } else if(nums[left] + nums[right] > sum) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        TripletZeroSum tripletZeroSum = new TripletZeroSum();
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(tripletZeroSum.threeSum(nums));
    }
}
