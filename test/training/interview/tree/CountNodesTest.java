package training.interview.tree;

import org.junit.jupiter.api.Test;
import training.interview.tree.model.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountNodesTest {

    @Test
    void isValidBST() {
        TreeNode treeNode = new TreeNode(2, new TreeNode(1, new TreeNode(8), new TreeNode(4)), new TreeNode(3, new TreeNode(4), null));

        int count = CountNodes.countNode(treeNode);

        assertEquals(6, count);
    }


}