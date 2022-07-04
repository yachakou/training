package training.interview.tree;

import training.interview.tree.model.TreeNode;

public class BuildTreeFromPreAndIn {

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return interNalBuildTree(0, 0, inorder.length - 1, preorder, inorder);
    }

    public static TreeNode interNalBuildTree(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        TreeNode treeNode = new TreeNode(preorder[preStart]);
        int inIndex;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == treeNode.val) {
                inIndex = i;
                break;
            }
        }
//        treeNode.left = interNalBuildTree(preStart + 1, , inEnd, preorder, inorder);
//        treeNode.right = interNalBuildTree(preStart + 1, , inEnd, preorder, inorder);

        return null;

    }


}
