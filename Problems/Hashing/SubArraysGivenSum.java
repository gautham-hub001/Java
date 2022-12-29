package Problems.Hashing;

import java.util.HashMap;
import java.util.Map;

public class SubArraysGivenSum {
    static void findArray(int[] arr, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, -1);

        int cumulativeSum = 0;
        for(int i=0; i<arr.length; i++) {
            cumulativeSum += arr[i];
            if(m.containsKey(cumulativeSum - target)) {
                System.out.println(m.get(cumulativeSum - target) + 1 + ", " + i);
            }
            m.put(cumulativeSum, i);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 0, 5, -7, 1, -4, 7, 6, 1, 4, 1, 10 };
        findArray(arr, 15);
    }
}
