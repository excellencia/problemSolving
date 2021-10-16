package general;

import java.util.HashSet;
import java.util.Set;

public class GCD {

    int gcd (int num1, int num2){
        Set<Integer> multiples = new HashSet<>();
        int gcd = 0;

        for(int i = 1; i <= num1; i++){
            if(num1 % i == 0){
                multiples.add(i);
            }
        }
        for(int j = 1; j<= num2; j++){
            if(num2 % j == 0){
                if(!multiples.add(j)){
                    gcd = Math.max(gcd, j);
                }

            }
        }
        return gcd;
    }


    public static void main(String[] args) {
        GCD gcd = new GCD();
        System.out.println(gcd.gcd(547, 54));
       // System.out.println(gcd.gcdOptimised(547, 54));
    }
}
