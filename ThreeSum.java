import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ThreeSum {
    public static void main(String args[]) {
        int[] arr = { 2, 7, 4, 0, 9, 5, 1, 3 };
        int target = 6;

        System.out.println(threeSumExistsOrNotUsingHashMap(arr,target));
        threeSumAllDistinctTripletsUsingSorting(arr,target);
    }
    static boolean threeSumExistsOrNotUsingHashMap(int[] arr, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            m.put(arr[i], i);
        }

        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length; j++) {
                int remaining = target - arr[i] - arr[j];
                if(m.containsKey(remaining) && i != j && i!= m.get(remaining) && j!= m.get(remaining)) {
                    System.out.println(m.get(remaining) + " " + i + " " + j);
                    return true;
                }
            }
        }
        return false;
    }

    static void threeSumAllDistinctTripletsUsingSorting(int[] arr, int target) {
        Arrays.sort(arr);

        for(int i=0; i<arr.length-2; i++) {
            int low = i+1, high = arr.length-1;
            while(low < high) {
                if(arr[i] + arr[low] + arr[high] < target) {
                    low++;
                }
                else if (arr[i] + arr[low] + arr[high] > target) {
                    high--;
                }
                else {
                    System.out.println(arr[i] + " " + arr[low] + " " + arr[high]);
                    low++;
                    high--;
                }
            }
        }
    }
}
