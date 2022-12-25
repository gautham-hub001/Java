package Problems.Hashing;

import java.util.HashMap;
import java.util.Map;

public class MaxLenSubArrayGivenSum {
    static void findArray(int[] arr, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, -1);

        int cumulativeSum = 0, maxlen=0, endingIndex=-1;
        for(int i=0; i<arr.length; i++) {
            cumulativeSum += arr[i];
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
        int[] arr = {5, 6, -5, 5, 3, 5, 3, -2, 0};
        findArray(arr, 8);
    }
}
