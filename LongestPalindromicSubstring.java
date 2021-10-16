package general;

public class LongestPalindromicSubstring {
    //O(n^3)
    public String longestPalindrome(String s){
        if(isPalindrome(s))
            return s;
        for(int len = s.length();len >0;len--){
            for(int i = 0; i+len <= s.length(); i++){
                String substring = s.substring(i, i + len);
                if (isPalindrome(substring))
                        return substring;
            }
        }
        return "";
    }

    private boolean isPalindrome(String s) {
        int l = 0, r= s.length()-1;
        while(l<r && s.charAt(l) == s.charAt(r)){
            l++;
            r--;
        }
        return l>=r;

    }
    //O(n^2)
    public String longestPalindromeOptimised(String s){
        String lps = "";
        int n = s.length();
        for(int i = 0; i < n; i++){
            String odd = expandPalindrome(s, i, i);
            String even = expandPalindrome(s,i,i+1);
            if(lps.length() < odd.length())
                lps = odd;
            if(lps.length() < even.length())
                lps = even;
        }
        return lps;
    }

    private String expandPalindrome(String s, int l, int r) {
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        System.out.println(lps.longestPalindromeOptimised("aaaabbaa"));
    }
}
