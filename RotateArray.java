package general;


public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        int l = 0;
        int r = n - 1;
        nums = reverse(l, r, nums);
        nums = reverse(0, k - 1, nums);
        nums = reverse(k, n-1, nums);

        for(int num : nums){
            System.out.print(num+" ");
        }

    }

    private int[] reverse(int l, int r, int[] arr){
        while(l < r){
            int temp;
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return arr;
    }

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] nums = new int[]{1,2,3,4,5,6,7};
        rotateArray.rotate(nums, 3);
    }
}
