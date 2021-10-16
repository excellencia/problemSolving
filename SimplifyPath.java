package Stack;

import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(String cur : path.split("/")){
                if(cur.equals("..")){
                    if(!stack.isEmpty())stack.pop();
                }
                else if(cur.length() > 0 && !cur.equals("."))
                    stack.push(cur);
        }
        return "/"+ String.join("/",stack);

    }

    public static void main(String[] args) {
        SimplifyPath simplifyPath = new SimplifyPath();
        System.out.println(simplifyPath.simplifyPath("/../"));
    }
}
