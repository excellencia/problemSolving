package tree;

public class MaximumDepth {

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

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left_depth = maxDepth(root.left);
        System.out.println("Left Depth: " + left_depth);
        int right_depth = maxDepth(root.right);
        System.out.println("Right Depth: " + right_depth);
        return Math.max(left_depth, right_depth) + 1;
    }

    public static void main(String[] args) {
        MaximumDepth maximumDepth = new MaximumDepth();
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
        System.out.println(maximumDepth.maxDepth(root));
    }
}
