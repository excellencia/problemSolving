package recursion;

public class SortArray {
    public static void sortArray(int[] array, int n) {
        if( n ==1)
            return;
        for(int i = 0; i < n-1; i++){
            if(array[i] > array[i+1]){
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        sortArray(array, n- 1);
        System.out.print("Sorted Array:");
    }

    public static void main(String[] args) {
        int[] array = {40, 24, 60, 15, 10, 45, 93};
        sortArray(array,array.length);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
