package DataStructures;

// https://www.techiedelight.com/clone-binary-tree/
class BinaryTreeNode {
    int data;
    BinaryTreeNode left, right;
    BinaryTreeNode(int data) {
        this.data = data;
    }
}
public class CloneBinaryTree {
    static BinaryTreeNode cloneTree(BinaryTreeNode root) {
        if(root == null) {
            return null;
        }
        BinaryTreeNode clone_node = new BinaryTreeNode(root.data);
        clone_node.left = cloneTree(root.left);
        clone_node.right = cloneTree(root.right);
        return clone_node;
    }

    static void inorder(BinaryTreeNode root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data + "->");
        inorder(root.right);
    }
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);
        root.right.left = new BinaryTreeNode(6);
        root.right.right = new BinaryTreeNode(7);

        BinaryTreeNode clone = cloneTree(root);
        inorder(clone);
    }
}
