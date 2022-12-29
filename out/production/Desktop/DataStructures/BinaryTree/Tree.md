DataStructures.BinaryTree.Node.java
public class DataStructures.BinaryTree.Node {
   public int data;
   public DataStructures.BinaryTree.Node leftChild;
   public DataStructures.BinaryTree.Node rightChild;

   public DataStructures.BinaryTree.Node(){}

   public void display(){
      System.out.print("("+data+ ")");
   }
}

Tree.java
public class Tree {
   private DataStructures.BinaryTree.Node root;

   public Tree(){
      root = null;
   }
   
   public DataStructures.BinaryTree.Node search(int data){
      DataStructures.BinaryTree.Node current = root;
      System.out.print("Visiting elements: ");
      while(current.data != data){
         if(current != null)
            System.out.print(current.data + " ");
            //go to left DataStructures.BinaryTree
            if(current.data > data){
               current = current.leftChild;
            }//else go to right DataStructures.BinaryTree
            else{                
               current = current.rightChild;
            }
            //not found
            if(current == null){
               return null;
            }
         }
      return current;
   }

   public void insert(int data){
      DataStructures.BinaryTree.Node tempNode = new DataStructures.BinaryTree.Node();
      tempNode.data = data;

      //if DataStructures.BinaryTree is empty
      if(root == null){
         root = tempNode;
     }else{
         DataStructures.BinaryTree.Node current = root;
         DataStructures.BinaryTree.Node parent = null;

         while(true){                
            parent = current;
            //go to left of the DataStructures.BinaryTree
            if(data < parent.data){
               current = current.leftChild;                
               //insert to the left
               if(current == null){
                  parent.leftChild = tempNode;
                  return;
               }
            }//go to right of the DataStructures.BinaryTree
            else{
               current = current.rightChild;
               //insert to the right
               if(current == null){
                  parent.rightChild = tempNode;
                  return;
               }
            }
         }            
      }
   }    

   public void traverse(int traversalType){
      switch(traversalType){
         case 1:
            System.out.print("\nPreorder traversal: ");
            preOrder(root);
            break;
         case 2:
            System.out.print("\nInorder traversal: ");
            inOrder(root);
            break;
         case 3:
            System.out.print("\nPostorder traversal: ");
            postOrder(root);
            break;
         }            
   }   

   private void preOrder(DataStructures.BinaryTree.Node root){
      if(root!=null){
         System.out.print(root.data + " ");
         preOrder(root.leftChild);
         preOrder(root.rightChild);
      }
   }

   private void inOrder(DataStructures.BinaryTree.Node root){
      if(root!=null){
         inOrder(root.leftChild);
         System.out.print(root.data + " ");            
         inOrder(root.rightChild);
      }
   }

   private void postOrder(DataStructures.BinaryTree.Node root){
      if(root!=null){            
         postOrder(root.leftChild);
         postOrder(root.rightChild);
         System.out.print(root.data + " ");
      }
   }
}


TreeDemo.java
public class TreeDemo {
   public static void main(String[] args){
      Tree DataStructures.BinaryTree = new Tree();

      /*                     11               //Level 0
      */
      DataStructures.BinaryTree.insert(11);
      /*                     11               //Level 0
      *                      |
      *                      |---20           //Level 1
      */
      DataStructures.BinaryTree.insert(20);
      /*                     11               //Level 0
      *                      |
      *                  3---|---20           //Level 1
      */
      DataStructures.BinaryTree.insert(3);        
      /*                     11               //Level 0
      *                      |
      *                  3---|---20           //Level 1
      *                           |
      *                           |--42       //Level 2
      */
      DataStructures.BinaryTree.insert(42);
      /*                     11               //Level 0
      *                      |
      *                  3---|---20           //Level 1
      *                           |
      *                           |--42       //Level 2
      *                               |
      *                               |--54   //Level 3
      */
      DataStructures.BinaryTree.insert(54);
      /*                     11               //Level 0
      *                      |
      *                  3---|---20           //Level 1
      *                           |
      *                       16--|--42       //Level 2
      *                               |
      *                               |--54   //Level 3
      */
      DataStructures.BinaryTree.insert(16);
      /*                     11               //Level 0
      *                      |
      *                  3---|---20           //Level 1
      *                           |
      *                       16--|--42       //Level 2
      *                               |
      *                           32--|--54   //Level 3
      */
      DataStructures.BinaryTree.insert(32);
      /*                     11               //Level 0
      *                      |
      *                  3---|---20           //Level 1
      *                  |        |
      *                  |--9 16--|--42       //Level 2
      *                               |
      *                           32--|--54   //Level 3
      */
      DataStructures.BinaryTree.insert(9);
      /*                     11               //Level 0
      *                      |
      *                  3---|---20           //Level 1
      *                  |        |
      *                  |--9 16--|--42       //Level 2
      *                     |         |
      *                  4--|     32--|--54   //Level 3
      */
      DataStructures.BinaryTree.insert(4);
      /*                     11               //Level 0
      *                      |
      *                  3---|---20           //Level 1
      *                  |        |
      *                  |--9 16--|--42       //Level 2
      *                     |         |
      *                  4--|--10 32--|--54   //Level 3
      */
      DataStructures.BinaryTree.insert(10);
      DataStructures.BinaryTree.Node node = DataStructures.BinaryTree.search(32);
      if(node!=null){
         System.out.print("Element found.");
         node.display();
         System.out.println();
      }else{
         System.out.println("Element not found.");
      }

      DataStructures.BinaryTree.Node node1 = DataStructures.BinaryTree.search(2);
      if(node1!=null){
         System.out.println("Element found.");
         node1.display();
         System.out.println();
      }else{
         System.out.println("Element not found.");
      }        

      //pre-order traversal
      //root, left ,right
      DataStructures.BinaryTree.traverse(1);
      //in-order traversal
      //left, root ,right
      DataStructures.BinaryTree.traverse(2);
      //post order traversal
      //left, right, root
      DataStructures.BinaryTree.traverse(3);       
   }
}

Output:
Visiting elements: 11 20 42 Element found.(32)
Visiting elements: 11 3 Element not found.

Preorder traversal: 11 3 9 4 10 20 16 42 32 54 
Inorder traversal: 3 4 9 10 11 16 20 32 42 54 
Postorder traversal: 4 10 9 3 16 32 54 42 20 11