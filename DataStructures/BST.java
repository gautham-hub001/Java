package DataStructures;

public class BST {
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

    // https://www.techiedelight.com/deletion-from-bst/
    static BinaryTreeNode deletion(BinaryTreeNode root, int value) {
        if(root == null) {
            return null;
        }
        if(value < root.data) {
            root.left = deletion(root.left, value);
        }
        else if(value > root.data) {
            root.right = deletion(root.right, value);
        }
        // node found
        else {
            // case 1 - node does not have any children
            if(root.left == null && root.right == null) {
                return null;
            }
            // case 2 - find inorder predecessor or inorder successor. Here, I'm finding inorder predecessor
            if(root.left != null && root.right != null) {
                root.data = findInorderPredecessor(root.left); // copy InorderPredecessor value and delete it.
                root.left = deletion(root.left, root.data); // inorder predecessor will have at most one child (left child)
            }
            // case 3 - node has either left child or right child
            else if (root.left != null){
                return root.left;
            }
            return root.right; // node has right child
        }
        return root;
    }

    // inorder predecessor is left subtree's rightmost child
    static int findInorderPredecessor(BinaryTreeNode root) {
        if(root.right == null) {
            return root.data;
        }
        return findInorderPredecessor(root.right);
    }
    public static void main(String[] args) {
        // insertionRecursive
        int[] values = { 15, 10, 20, 8, 12, 16, 25 };
        BinaryTreeNode root = null;
        for(int value: values) {
            root = insertionRecursive(root, value);
        }
        CloneBinaryTree.inorder(root); // BST's inorder gives sorted output (in ascending order)

        System.out.println();

        // insertionIterative
        BinaryTreeNode root2 = null;
        for(int value: values) {
            root2 = insertionIterative(root2, value);
        }
        CloneBinaryTree.inorder(root2); // BST's inorder gives sorted output (in ascending order)
        System.out.println();

        // deletion
        deletion(root, 12);

        CloneBinaryTree.inorder(root);
    }
}
