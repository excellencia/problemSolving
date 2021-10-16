package general;

public class ContainerWithMostWater {
    //BRUTE FORCE
    // Time Complexity - O(n2)
    public int maxArea(int[] height) {
        int res = 0;
        for (int l = 0; l < height.length; ++l) {
            for (int r = l + 1; r < height.length; ++r) {
                int area = (r - l) * Math.min(height[r], height[l]);
                res = Math.max(res, area);
            }
        }
        return res;
    }

    public int maxAreaOptimal(int[] height){
        int res = 0;
        int l = 0, r = height.length - 1;

        while(l < r){
            int area = (r - l) * Math.min(height[l],height[r]);
            res = Math.max(res,area);
            if(height[l] < height[r])
                ++l;
            else
                r--;
        }
        return res;
    }

    public static void main(String[] args) {
        ContainerWithMostWater water = new ContainerWithMostWater();
        System.out.println(water.maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
        System.out.println(water.maxAreaOptimal(new int[] {1,8,6,2,5,4,8,3,7}));
    }
}
