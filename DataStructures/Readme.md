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
