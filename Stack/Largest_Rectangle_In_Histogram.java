package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Largest_Rectangle_In_Histogram {
    public int largestRectangleArea(int[] heights){
        int n = heights.length;
        int maxArea = 0;
        for(int i = 0; i < n; i++){
            int minHeight = Integer.MAX_VALUE;
            for(int j = i; j < n; j++){
                minHeight = Math.min(minHeight,heights[j]);
                int width = j-i+1;
                maxArea = Math.max(maxArea,minHeight*width);
            }
        }
        return maxArea;
    }

    //Function to find largest rectangular area possible in a given histogram.
/*    public static long getMaxArea(long hist[], long n)
    {
        long maxArea = 0;
        for(long i = 0; i < n; i++){
            long minHeight =  Long.MAX_VALUE;
            for(long j = i; j < n; j++ ){
                minHeight = Math.min(minHeight, hist[j]);
                long width = j-i+1;
                maxArea = Math.max(maxArea, minHeight*width);
            }
        }
        return maxArea;
    }*/

    //T:O(N) & S: O(N)
    public int largestRect(int []heights){
        int n = heights.length;
        int maxArea = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        for(int i = 0; i < n; i++){
            while(stack.peek() != -1 && (heights[i] <= heights[stack.peek()])){
                int currentHeight = heights[stack.pop()];
                int currentWidth = i - stack.peek() - 1;
                maxArea = Math.max(maxArea,currentHeight * currentWidth);
            }
            stack.push(i);
        }
        while (stack.peek() != -1){
            int currentHeight = heights[stack.pop()];
            int currentWidth = n - stack.peek()-1;
            maxArea = Math.max(maxArea,currentHeight * currentWidth);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Largest_Rectangle_In_Histogram largest_rectangle_in_histogram = new Largest_Rectangle_In_Histogram();
        int[] heights = new int[] {2,1,5,6,2,3};
        long[] hist = new long[]{2,1,5,6,2,3};
        System.out.println(largest_rectangle_in_histogram.largestRectangleArea(heights));
        System.out.println(largest_rectangle_in_histogram.largestRect(heights));
        //System.out.println(Largest_Rectangle_In_Histogram.getMaxArea(hist,6));
    }
}
