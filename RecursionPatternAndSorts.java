import java.util.Arrays;

public class RecursionPatternAndSorts {
    public static void main(String[] args) {
        pattern(4);
        patternReverse(4, 0);
        int[] arr = {1,2,11,6,28,2};
        bubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {1,2,11,6,28,2};
        selectionSort(arr2, arr2.length - 1, 0, 0);
        System.out.println(Arrays.toString(arr2));
    }
    static void pattern(int n) {
        patternHelper(n, 0);
    }
    static void patternHelper(int r, int c) {
        if(r == 0){
            return;
        }
        if(c<r){
            System.out.print("*");
            patternHelper(r, c+1);
        }
        else {
            System.out.println();
            patternHelper(r-1, 0);
        }
    }
    static void patternReverse(int r, int c) {
        if(r == 0){
            return;
        }
        if(c<r){
            patternReverse(r, c+1);
            System.out.print("*");
        }
        else {
            patternReverse(r-1, 0);
            System.out.println();
        }
    }

    // bubbleSort is very similar to pattern problem. But we swap adjacent elements if left element is larger than it's adjacent element
    // So for each iteration we get max element at the end. So, we go till second element from end. and so on.
    static void bubbleSort(int[] arr, int r, int c) {
        if(r==0)
            return;
        if(c<r) {
            if(arr[c]>arr[c+1]) {
                swap(arr, c, c+1);
            }
            bubbleSort(arr, r,  c+1);
        }
        else {
            bubbleSort(arr, r-1, 0);
        }
    }

    // This is also similar to the star pattern problem.
    // But we store the largest element index among the current iteration and swap it with the end element of the iteration.
    static void selectionSort(int[] arr, int r, int c, int largestIndex) {
        if(r==0) {
            return;
        }
        if(c<=r){
            if(arr[c]>arr[largestIndex]) {
                largestIndex = c;
            }
            selectionSort(arr, r, c+1, largestIndex);
        }
        else {
            swap(arr, largestIndex, r);
            selectionSort(arr, r-1, 0, 0);
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
