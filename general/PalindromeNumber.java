package general;

public class PalindromeNumber {

    // #intuition
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        int l = 0;
        int r = num.length()-1;
        while(l < r && num.charAt(l) == num.charAt(r)){
            l++;
            r--;
        }
        return l>=r;
    }

    // #optimised


    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(111));
    }
}
