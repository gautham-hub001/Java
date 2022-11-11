package tree;

public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    public void insert(int data) {
        Node tempNode = new Node();
        tempNode.data = data;

        if(root == null) {
            root = tempNode;
            return;
        }
        Node currNode = root;
        while (currNode != null) {
            if(currNode.leftNode == null){
                currNode.leftNode = tempNode;
                break;
            }
            else if(currNode.rightNode == null) {
                currNode.rightNode = tempNode;
                break;
            }
            else {
                currNode = currNode.leftNode;
            }
        }
        return;
    }
}
