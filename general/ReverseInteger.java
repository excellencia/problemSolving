package general;

public class ReverseInteger {
    public int reverse(int x) {
        try {
            boolean negativeFlag = false;
            if (x < 0) {
                x = x * (-1);
                negativeFlag = true;
            }
            String s = String.valueOf(x);
            StringBuilder sb = new StringBuilder();
            char[] numbers = s.toCharArray();
            int length = numbers.length;
            for (int len = length - 1; len >= 0; len--) {
                sb.append(numbers[len]);
            }
            String reversedString = sb.toString();

            return (negativeFlag == true) ? (-1) * Integer.valueOf(reversedString) : Integer.valueOf(reversedString);
        }
        catch (NumberFormatException e){
            return 0;
        }

    }

    public int reverseOptimised(int x){
        long reversed = 0;
        while(x!=0){
            reversed = reversed*10 + x%10;
            x /= 10;
        }
        return ((reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) ? 0 : (int)reversed);
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverseOptimised(1534236469));
    }
}
