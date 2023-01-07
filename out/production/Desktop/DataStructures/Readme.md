Data structures:
array
string
linked list
stack 
queue
Binary Tree
Binary search Tree
Heap
Hash table
Graph
Matrix

DSA:
**https://www.programiz.com/dsa/spanning-tree-and-minimum-spanning-tree**

Note: An inorder successor of a node in the BST is the next node in the inorder sequence.
Note: An inorder predecessor of a node in the BST is the previous node in the inorder sequence.
As with all binary trees, a node’s inorder successor is its right subtree’s leftmost child,
and a node’s inorder predecessor is the left subtree’s rightmost child.

# Hash table:
uses key value pairs
key- index
value - data
Let k be a key and h(x) be a hash function.
Here, h(k) will give us a new index to store the element linked with k.

hash collision resolution:
1. chaining- In chaining, if a hash function produces the same index for multiple elements, these elements are stored in
the same index by using a doubly-linked list.
2. open addressing - linear probing, quadratic probing, double hashing
   1. Linear probing - h(k, i) = (h′(k) + i) mod m. If a collision occurs at h(k, 0), then h(k, 1) is checked. 
   In this way, the value of i is incremented linearly.
   2. Quadratic probing - h(k, i) = (h′(k) + c1 * i + c2 * i^2) mod m. 
   3. Double hashing - 2 hash functions are used. h(k, i) = (h1(k) + i * h2(k)) mod m

**Full Binary tree (FBT)/ proper binary tree** is a special type of binary tree in which every parent node/internal node has either two or no children.
**Complete Binary Tree(CBT)** is a binary tree in which every level, except possibly the last, is completely filled,
and all nodes in the last level are as far left as possible.
**Perfect Binary Tree** is a type of binary tree in which every internal node has exactly two child nodes and all the leaf nodes are at the same level.
**Balanced Binary Tree/Height-Balanced Binary Tree** is a binary tree in which the height of the left and right subtree of any node differ by not more than 1.
Conditions for a height-balanced binary tree:
1. Difference between the left and the right subtree for any node is not more than one
2. Left subtree is balanced
3. Right subtree is balanced

**AVL tree** is a self-balancing binary search tree in which each node maintains extra information 
called a balance factor whose value is either -1, 0 or +1.

**Graphs**
1. Adjacency matrix
2. Adjacency list

**Connected graph** is a graph in which there is always a path from a vertex to any other vertex.
**Spanning tree** is a sub-graph of an undirected connected graph, which includes all the vertices of the graph
with a minimum possible number of edges.
**minimum spanning tree** is a spanning tree in which the sum of the weight of the edges is as minimum as possible.
The minimum spanning tree from a graph is found using the following algorithms:
1. Prim's Algorithm
2. Kruskal's Algorithm