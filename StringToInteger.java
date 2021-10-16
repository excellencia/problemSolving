package general;

public class StringToInteger {
    int sign = 1;
    long convertedInteger = 0;
    int previousResult;
    int result;
    public int myAtoi(String s) {
        if(isEmptyString(s))
            return 0;
        s = removeLeadingWhiteSpace(s);
        if(isEmptyString(s))
            return 0;
        sign = signed(s);
        return atoi(s);

    }

    private int atoi(String s) {
        String regex = "\\d+";
        StringBuilder sb = new StringBuilder();
        if(s.charAt(0) == '-' || s.charAt(0)=='+')
            s = s.substring(1);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                previousResult = result;
                result = result*10 + (s.charAt(i)-'0');
            }
            else break;
            if(previousResult != result/10){
                if(sign == -1){
                    return Integer.MIN_VALUE;
                }
                else {
                    return Integer.MAX_VALUE;
                }
            }
        }
        return sign*result;
        }

    private String removeLeadingWhiteSpace(String s) {
        return s.trim();
    }

    private int signed(String s) {
        if(s.charAt(0) == '-')
            return -1;
        return 1;
    }

    private boolean isEmptyString(String s){
        if(s.isEmpty())
            return true;
        return false;
    }

    public static void main(String[] args) {
        StringToInteger  stringToInteger = new StringToInteger();
        System.out.println(stringToInteger.myAtoi("n "));
    }
}
