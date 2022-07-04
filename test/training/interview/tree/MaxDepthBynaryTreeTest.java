package training.interview.tree;

import org.junit.jupiter.api.Test;
import training.interview.tree.model.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxDepthBynaryTreeTest {
    @Test
    void maxDepth() {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        int result = MaxDepthBynaryTree.maxDepth(treeNode);

        assertEquals(2, result);
    }

    @Test
    void maxDepthv2() {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        int result = MaxDepthBynaryTree.maxDepthv2(treeNode);

        assertEquals(2, result);
    }
}