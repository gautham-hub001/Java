import java.util.Arrays;

public class Permutations {
    static void permute(int[] arr, int k) {
        for (int i = k; i < arr.length; i++) {
            swap(arr, i, k);
            permute(arr, k + 1);
            swap(arr, i, k); // swap back
        }
        if (k == arr.length - 1) {
            System.out.println(Arrays.toString(arr));
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        permute(arr, 0);
    }
}