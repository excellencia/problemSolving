package recursion;

public class PermutationOfAString {
    void permutations(char[] str, int len){
        if(len == 1){
            System.out.println(str);
            return;
        }
        for(int i = 0; i < str.length; i++){
            swap(str, i, len-1);
            permutations(str,len-1);
            swap(str, i, len-1);
        }
    }

    private void swap(char[] str, int i, int i1) {
        char c;
        c = str[i];
        str[i] = str[i1];
        str[i1] = c;
    }

    public static void main( String args[] ) {
        PermutationOfAString permute = new PermutationOfAString();
        char[] input = {'a', 'b', 'b', 'a'};
        permute.permutations(input, input.length);
    }
}
