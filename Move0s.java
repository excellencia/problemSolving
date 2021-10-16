package general;

public class Move0s {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;
        int cur = 0;
        for(lastNonZeroFoundAt = 0, cur = 0; cur < nums.length; cur++){
            if(nums[cur] != 0){
                nums = swap(lastNonZeroFoundAt++,cur,nums);
            }
        }

    }

    private int[] swap(int l, int r, int[] arr){
        int temp;
        temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        return arr;
    }

    public static void main(String[] args) {
        Move0s move0s = new Move0s();
        int[] nums = new int[]{0,1,0,3,12};
        move0s.moveZeroes(nums);
    }
}
