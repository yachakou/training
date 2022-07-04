package training.interview.tree;

import org.junit.jupiter.api.Test;
import training.interview.tree.model.TreeNode;

import java.util.List;

class BinaryTreeLevelOrderTraversalTest {


    @Test
    public void levelOrder() {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        List<List<Integer>> lists = BinaryTreeLevelOrderTraversal.levelOrder(treeNode);
    }
}