package Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,90};
        twoSumUsingLinearSearch(arr, 5);
        twoSumUsingPointers(arr, 5);
        twoSumUsingHashTable(arr, 5);
    }

    static void twoSumUsingLinearSearch(int[] arr, int target) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.println(arr[i]+ " " + arr[j]);
                    return;
                }
            }
        }
        System.out.println(-1);
    }

    static void twoSumUsingPointers(int[] arr, int target) {
        Arrays.sort(arr);
        int l = 0, r = arr.length-1;

        while(l<r) {
            if(arr[l] + arr[r] == target) {
                System.out.println(arr[l] + " " + arr[r]);
                return;
            }
            if(arr[l]+ arr[r] < target) {
                l++;
            }
            else{
                r--;
            }
        }
        System.out.println(-1);
    }

    static void twoSumUsingHashTable(int[] arr, int target) {
        Map<Integer, Integer> m = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            if(m.containsKey(target-arr[i])) {
                System.out.println(arr[m.get(target-arr[i])]+ " " +arr[i]);
                return;
            }
            m.put(arr[i],i);
        }
        System.out.println(-1);
    }
}
