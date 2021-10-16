package general;

import java.util.HashSet;
import java.util.Set;


public class LongestSubstringWithoutRepeating {
/*    // O(n^3)
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int n = s.length();
        for(int i= n; i >= 0; i--){
            for(int j = 0; j+i <= n; j++){
              if(isUniqueCharSubstring(s.substring(j,j+i)))
                  return i;
            }
        }
        return 1;

    }*/

    public int lengthOfLongestSubstring(String s){
        Set<Character> characterSet = new HashSet<>();
        int longest = 0, i = 0, j = 0, n = s.length();

        while (i<n && j<n){
            if(characterSet.contains(s.charAt(j))){
                characterSet.remove(s.charAt(i++));
            }
            else{
                characterSet.add(s.charAt(j++));
                longest = Math.max(longest,j-i);
            }
        }
        return longest;

    }
    int longestUniqueSubsttr(String S){
        Set<Character> chars = new HashSet<>();
        int i=0,j=0,longest=0,n=S.length();
        while(i<n && j<n){
            if(chars.contains(S.charAt(j))){
                chars.remove(S.charAt(i++));
            }
            else{
                chars.add(S.charAt(j++));
                longest = Math.max(longest,j-i);
            }
        }
        return longest;

    }

    private boolean isUniqueCharSubstring(String s) {
        Set<Character> characterSet = new HashSet<>();
        for(char c : s.toCharArray()){
            characterSet.add(c);
        }
        return(characterSet.size() == s.length());
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeating longestSubstringWithoutRepeating = new LongestSubstringWithoutRepeating();
        int length = longestSubstringWithoutRepeating.longestUniqueSubsttr("geeksforgeeks");
        System.out.println(length);
    }
}
