package training.interview.tree;

import training.interview.tree.model.TreeNode;

public class ValidBST {

    public static boolean isValidBST(TreeNode root) {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }


    public static boolean isValidBST(TreeNode node, int min, int max) {
        if (node == null)
            return true;

        if (node.val < min || node.val > max)
            return false;

        if (node.left != null && (node.left.val > node.val || node.left.val == node.val))
            return false;
        if (node.right != null && (node.right.val < node.val || node.right.val == node.val))
            return false;

        return isValidBST(node.left, min, node.val - 1) && isValidBST(node.right, node.val + 1 , max);
    }
}
