package training.interview.tree;

import org.junit.jupiter.api.Test;
import training.interview.tree.model.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class ValidBSTTest {


    @Test
    void isValidBST() {
//        TreeNode treeNode = new TreeNode(5, new TreeNode(4), new TreeNode(6, new TreeNode(3), new TreeNode(7)));
        TreeNode treeNode = new TreeNode(2, new TreeNode(1), new TreeNode(3));
//        TreeNode treeNode = new TreeNode(5, new TreeNode(2), new TreeNode(6));

        boolean res = ValidBST.isValidBST(treeNode);

        System.out.println(res);
    }

}