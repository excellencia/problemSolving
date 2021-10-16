package general;

/*Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.



        Example 1:

        Input: s = "Let's take LeetCode contest"
        Output: "s'teL ekat edoCteeL tsetnoc"
        Example 2:

        Input: s = "God Ding"
        Output: "doG gniD"*/
public class ReverseWordsInAString {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] words = s.split(" ");
        for (String word : words){
            res.append(reverse(word)).append(" ");
        }
        return res.toString().trim();

    }

    private String reverse(String word) {
        StringBuilder res = new StringBuilder(word);
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        ReverseWordsInAString rev = new ReverseWordsInAString();
        String s = "Let's take LeetCode contest";
        System.out.println(rev.reverseWords(s));
    }

}
