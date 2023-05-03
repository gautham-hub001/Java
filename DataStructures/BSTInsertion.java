package DataStructures;

public class BSTInsertion {
    // Time coplexity - O(h)
    static BinaryTreeNode insertionRecursive(BinaryTreeNode root, int value) {
        if(root == null) {
            return new BinaryTreeNode(value);
        }
        if(value < root.data) {
            root.left = insertionRecursive(root.left, value);
        }
        else {
            root.right = insertionRecursive(root.right, value);
        }
        return root;
    }

    static BinaryTreeNode insertionIterative(BinaryTreeNode root, int value) {
        if(root == null) {
            return new BinaryTreeNode(value);
        }
        BinaryTreeNode curr = root;
        while(curr != null) {
            if(value < root.data) {
                curr.left = 
            }
        }
    }
    public static void main(String[] args) {
        int[] values = { 15, 10, 20, 8, 12, 16, 25 };
        BinaryTreeNode root = null;
        for(int value: values) {
            root = insertionRecursive(root, value);
        }
        CloneBinaryTree.inorder(root); // BST's inorder gives sorted output (in ascending order)
    }
}
