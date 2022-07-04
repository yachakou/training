package training.interview.tree;

import training.interview.tree.model.TreeNode;

public class MaxDepthBynaryTree {
    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int count = 1;
        return Math.max(countMax(root.left, count), countMax(root.right, count));
    }

    private static int countMax(TreeNode node, int count) {
        if (node == null)
            return count;

        count += 1;
        return Math.max(countMax(node.left, count), countMax(node.right, count));
    }

    public static int maxDepthv2(TreeNode root) {
        if (root == null)
            return 0;

        return Math.max(1 + maxDepth(root.left), 1 + maxDepth(root.right));
    }
}
