package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelTraversalBFS {
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

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root != null)
            queue.offer(root);
        TreeNode curr;
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> subAns = new ArrayList<>();
            for(int i = 0; i < size; ++i){
                curr = queue.poll();
                subAns.add(curr.val);
                if(curr.left != null)
                    queue.offer(curr.left);
                if(curr.right != null)
                    queue.offer(curr.right);
            }
            ans.add(subAns);
        }

        return ans;
    }

    public static void main(String[] args) {
        BinaryTreeLevelTraversalBFS bfs = new BinaryTreeLevelTraversalBFS();
        TreeNode root = new TreeNode();
        root.val = 0;
        root.left = new TreeNode();
        root.left.left = new TreeNode();
        root.left.right = new TreeNode();
        root.left.val = 1;
        root.left.left.val = 2;
        root.left.right.val = 3;
        root.right = new TreeNode();
        root.right.val = 4;
        root.right.left = new TreeNode();
        root.right.left.val = 5;
        System.out.println(bfs.levelOrder(root));
    }
}
