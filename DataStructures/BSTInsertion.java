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
        BinaryTreeNode parent = null;
        BinaryTreeNode curr = root;
        // traverse the tree using curr, to find right position to insert the value
        while(curr != null) {
            parent = curr;
            if(value < curr.data) {
                curr = curr.left;
            }
            else {
                curr = curr.right;
            }
        }
        if(value < parent.data) {
            parent.left = new BinaryTreeNode(value);
        }
        else {
            parent.right = new BinaryTreeNode(value);
        }
        return root;
    }
    public static void main(String[] args) {
        int[] values = { 15, 10, 20, 8, 12, 16, 25 };
        BinaryTreeNode root = null;
        for(int value: values) {
            root = insertionRecursive(root, value);
        }
        CloneBinaryTree.inorder(root); // BST's inorder gives sorted output (in ascending order)

        System.out.println();

        BinaryTreeNode root2 = null;
        for(int value: values) {
            root2 = insertionIterative(root2, value);
        }
        CloneBinaryTree.inorder(root2); // BST's inorder gives sorted output (in ascending order)
    }
}
