package recursion;

import java.util.Stack;

public class ReverseString {

    String reverse(String str){
        if(str.isEmpty())
            return str;
        else{
            return reverse(str.substring(1))+str.charAt(0);
        }
    }

    String reverseByStack(String str){
        Stack<Character> stack = new Stack<>();
        StringBuilder reversedString = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            stack.push(str.charAt(i));
        }
        for (int j = 0; j < stack.size(); j++){
            reversedString.append(stack.pop());
        }
        return reversedString.toString();
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverse("Hello World"));
        System.out.println(reverseString.reverseByStack("Hello World"));
    }
}
