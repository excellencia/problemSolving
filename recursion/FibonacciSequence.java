package recursion;

public class FibonacciSequence {

    int fib(int n){
        if(n <= 1){
            return n;
        }
        else
            return fib(n-1) + fib(n - 2) ;
    }

    public static void main(String[] args) {
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        System.out.println(fibonacciSequence.fib(4));
        System.out.println("Division: "+ 6/3);
    }
}
