package DataStructures;
import java.util.ArrayList;
// https://www.programiz.com/dsa/heap-data-structure

// Heap is a complete binary tree (CBT) but we don't actually implement it as a tree, we use array or ArrayList.
// A complete binary tree is a binary tree in which every level, except possibly the last, is completely filled,
// and all nodes in the last level are as far left as possible.
// Binary heap => it's a binary tree
// Max Heap implementation
class Heap {
    void heapify(ArrayList<Integer> h, int i) {
        int size = h.size();
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < size && h.get(l) > h.get(largest))
            largest = l;
        if (r < size && h.get(r) > h.get(largest))
            largest = r;

        if (largest != i) {
            // swap largest and i
            int temp = h.get(largest);
            h.set(largest, h.get(i));
            h.set(i, temp);

            heapify(h, largest);
        }
    }

    void insert(ArrayList<Integer> h, int newNum) {
        if (h.size() == 0) {
            h.add(newNum);
        } else {
            h.add(newNum);
            for (int i = h.size() / 2 - 1; i >= 0; i--) {
                heapify(h, i);
            }
        }
    }

    void deleteNode(ArrayList<Integer> h, int num)
    {
        int size = h.size();
        int i;
        for (i = 0; i < size; i++)
        {
            if (num == h.get(i))
                break;
        }

        // copy last element in the heap
        h.set(i, h.get(size-1));
        h.remove(size-1);

        for (int j = size / 2 - 1; j >= 0; j--)
        {
            heapify(h, j);
        }
    }

    void printArray(ArrayList<Integer> array, int size) {
        for (Integer i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ArrayList<Integer> heap = new ArrayList<Integer>();
        int size = heap.size(); // 0

        Heap h = new Heap();
        h.insert(heap, 3);
        h.insert(heap, 4);
        h.insert(heap, 9);
        h.insert(heap, 5);
        h.insert(heap, 2);
        h.insert(heap, 6);
        h.insert(heap, 7);
        h.insert(heap, 9);

        System.out.println("Max-Heap array: ");
        h.printArray(heap, size);

        h.deleteNode(heap, 9);
        System.out.println("After deleting an element: ");
        h.printArray(heap, size);
    }
}

//          9
//      9       7
//  5      2 4     6
//3