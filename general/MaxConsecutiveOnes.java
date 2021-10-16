package general;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxSum = 0, sum = 0;
        for (int n : nums) {
            sum *= n;
            sum += n;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args)
    {
        int[] nums = {0,1,1,0,1,1,1,0,0,1,1,1,1};
        MaxConsecutiveOnes mco = new MaxConsecutiveOnes();
        System.out.println( mco.findMaxConsecutiveOnes(nums));
    }
}
