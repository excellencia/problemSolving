package general;

import java.util.List;

public class MatrixDiagonalDiff {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int sumPrimary = 0, sumSecondary = 0;
        int n = arr.size();
        // Write your code here
        for (int i = 0; i < n; i++){
            sumPrimary += arr.get(i).get(i);
            sumSecondary += arr.get(i).get(n - i - 1);
        }


        return Math.abs(sumPrimary - sumSecondary);

    }

    public static void main(String[] args) {

    }

}
