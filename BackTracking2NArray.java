import java.util.Scanner;
import java.util.Arrays;

public class BackTracking2NArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n:");
        int n = scan.nextInt();

        int[] arr = new int[2*n];
        Arrays.fill(arr, -1); // initialize array with -1

        find2NArray(arr, 1, n);
    }
    public static void find2NArray(int[] arr, int x, int n) {
        if(x>n) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for(int i=0; i<2*n; i++) {
            if(arr[i] == -1 && i+x+1 <2*n &&arr[i+x+1] == -1) {
                arr[i] = x;
                arr[i+x+1] =x;
                find2NArray(arr, x+1, n);

                // backtrack
                arr[i] = -1;
                arr[i+x+1] = -1;
            }
        }
    }
}
