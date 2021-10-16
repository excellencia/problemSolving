package general;

public class MedianOfTwoSortedArrays {
/*    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        int x = nums1.length;
        int y = nums2.length;

        int low = 0;
        int high = x;
        while(low<=high) {
            int partitionx = (low + high) / 2;
            int partitiony = (x + y + 1) / 2 - partitionx;

            int maxLeftX = (partitionx == 0) ? Integer.MIN_VALUE : nums1[partitionx - 1];
            int minRightX = (partitionx == x) ? Integer.MAX_VALUE : nums1[partitionx];

            int maxLeftY = (partitiony == 0) ? Integer.MIN_VALUE : nums2[partitiony - 1];
            int minRightY = (partitiony == y) ? Integer.MAX_VALUE : nums2[partitiony];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if ((x + y) % 2 == 0)
                    return (double) (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
                else
                    return (double) Math.max(maxLeftX, maxLeftY);
            } else if (maxLeftX > minRightY)
                high = partitionx - 1;
            else
                low = partitionx + 1;
        }
        throw new IllegalArgumentException();
    }*/
public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    if(nums1.length > nums2.length){
        return findMedianSortedArrays(nums2,nums1);
    }

    int x = nums1.length;
    int y = nums2.length;

    int low = 0;
    int high = x;

    while(low <= high){
        int partitionX = (low+high)/2;
        int partitionY = (x+y+1)/2-partitionX;

        int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE:nums1[partitionX-1];
        int minRightX = (partitionX == x) ? Integer.MAX_VALUE:nums1[partitionX];

        int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE:nums2[partitionY-1];
        int minRightY = (partitionY == y) ? Integer.MAX_VALUE:nums2[partitionY];

        if(maxLeftX <= minRightY && maxLeftY <= minRightX){
            if((x+y)%2==0){
                return (double) (Math.max(maxLeftX,maxLeftY)+Math.min(minRightX,minRightY))/2;
            }
            else
                return (double) Math.max(maxLeftX,maxLeftY);
        }
        else if(maxLeftX > minRightY)
            high = partitionX-1;
        else
            low = partitionX+1;
    }
    throw new IllegalArgumentException();

}

    public static void main(String[] args) {
        int x[] = {1};
        int y[] = {1};
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        double median = medianOfTwoSortedArrays.findMedianSortedArrays(x,y);
        System.out.println(median);
    }
}
