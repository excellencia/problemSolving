package tree;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.List;

public class PreorderTraversal {
    /**
     * Definition for a binary tree node.     */
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        System.out.println(root.val);
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if(root == null)
            return output;
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode node = new TreeNode();
            node = stack.pollLast();
            System.out.println(node.val);
            output.add(node.val);
            if(node.right!=null){
                stack.add(node.right);
            }
            if(node.left != null){
                stack.add(node.left);
            }
        }
        return output;


    }

    public static void main(String[] args) {
        PreorderTraversal pot = new PreorderTraversal();
        PreorderTraversal.TreeNode root = new PreorderTraversal.TreeNode();
        root.val = 1;
        root.left = new PreorderTraversal.TreeNode();
        root.left.left = new PreorderTraversal.TreeNode();
        root.left.right = new PreorderTraversal.TreeNode();
        root.left.val = 0;
        root.left.left.val = 4;
        root.left.right.val = 5;
        root.right = new PreorderTraversal.TreeNode();
        root.right.val = 2;
        root.right.left = new PreorderTraversal.TreeNode();
        root.right.left.val = 3;
        System.out.println(pot.preorderTraversal(root));
    }

}
