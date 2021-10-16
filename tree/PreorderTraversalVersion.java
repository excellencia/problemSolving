package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



class PreorderTraversalVersion
{

    static class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }

    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> preoutput = new LinkedList<>();


        if(root == null){
            return new ArrayList<>(preoutput);
        }

        stack.add(root);

        while(!stack.isEmpty()){
            Node node = new Node(stack.pollLast().data);
            preoutput.add(node.data);

            if(node.right != null){
                stack.add(node.right);
            }

            if(node.left != null){
                stack.add(node.left);
            }

        }
        ArrayList<Integer> output = new ArrayList<>(preoutput);
        return output;
    }

    public static void main(String[] args) {
        PreorderTraversalVersion pot = new PreorderTraversalVersion();
        PreorderTraversalVersion.Node root = new PreorderTraversalVersion.Node(1);
        root.left = new PreorderTraversalVersion.Node(0);
        root.left.left = new PreorderTraversalVersion.Node(4);
        root.left.right = new PreorderTraversalVersion.Node(5);
        root.right = new PreorderTraversalVersion.Node(2);
        root.right.left = new PreorderTraversalVersion.Node(3);
        System.out.println(pot.preorder(root));
    }

}
