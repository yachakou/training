package training.interview.tree;

import training.interview.tree.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {


    public static List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        int i = MaxDepthBynaryTree.maxDepth(root);

        for (int j = 1; j <= i; j++) {
            printLevel(root, j);
        }
        return result;
    }

    private static void printLevel(TreeNode root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.println(root.val);
        else if (level > 1) {
            printLevel(root.right, level - 1);
            printLevel(root.left, level - 1);
        }

    }
}
