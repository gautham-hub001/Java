package Problems.Hashing;

import java.util.HashMap;
import java.util.Map;

// Find the largest sub array having an equal number of 0’s and 1’s
// If we replace 0s with -1, then the problem gets converted to MaxLenSubArrayGivenSum with target = 0

// https://www.techiedelight.com/find-maximum-length-sub-array-equal-number-0s-1s/

public class MaxLenSubArrayEqual01 {
    static void findArray(int[] arr, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, -1);

        int cumulativeSum = 0, maxlen=0, endingIndex=-1;
        for(int i=0; i<arr.length; i++) {
            cumulativeSum += (arr[i] == 0)? -1: 1;
            m.putIfAbsent(cumulativeSum, i);
            if(m.containsKey(cumulativeSum - target) && maxlen < i - m.get(cumulativeSum - target)) {
                maxlen = i - m.get(cumulativeSum - target);
                endingIndex = i;
            }
        }
        if(endingIndex == -1){
            System.out.println("No subarray exists");
            return;
        }
        System.out.println("start: "  + (endingIndex - maxlen +1 )+ " ending: " + endingIndex);
    }
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 0, 1, 0, 0 };
        findArray(arr, 0);
    }
}
