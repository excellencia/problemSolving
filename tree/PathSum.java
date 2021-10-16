package tree;

import java.util.LinkedList;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> sum = new LinkedList<>();
        stack.add(root);
        sum.add(targetSum - root.val);

        TreeNode curNode;
        int curSum;

        while (!stack.isEmpty()) {
            curNode = stack.pollLast();
            curSum = sum.pollLast();
            if (curNode.left == null && curNode.right == null && curSum == 0)
                return true;
            if (curNode.left != null) {
                stack.add(curNode.left);
                sum.add(curSum - curNode.left.val);
            }
            if (curNode.right != null) {
                stack.add(curNode.right);
                sum.add(curSum - curNode.right.val);
            }
        }
        return false;

    }

    public static void main(String[] args) {
        PathSum pathSum = new PathSum();
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
        System.out.println(pathSum.hasPathSum(root, 0));
    }
}
