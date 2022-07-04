package training.interview.tree;

import training.interview.tree.model.TreeNode;

public class CountNodes {

    public static int countNode(TreeNode treeNode) {
        if (treeNode == null)
            return 0;
        else {
            return 1 + countNode(treeNode.right) + countNode(treeNode.left);
        }
    }
}
