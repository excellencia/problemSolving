package recursion;

public class SumOfIntegers {

    int sumAll(int n){
        if(n == 1)
            return 1;
        else
            return n + sumAll(n-1);
    }

    public static void main(String[] args) {
        SumOfIntegers sum = new SumOfIntegers();
        System.out.println(sum.sumAll(5));
    }
}
