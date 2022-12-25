package Problems.Hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArrayZeroSumExists {
    public static void main(String []args) {
        int[] arr = { 4, -6, 3, -1, 4, 2, 7 };
        System.out.println(subArrayZeroSum(arr));
//        System.out.println(a);
        System.out.println(Arrays.toString(arr));
        System.out.println();

        int[] nums = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        printAllSubarrays(nums);
    }

    static boolean subArrayZeroSum(int[] arr) {
        int sum=0;
        Set<Integer> s = new HashSet<>();
        s.add(sum);

        for(int value: arr) {
            sum += value;
            if(s.contains(sum)) {
                return true;
            }
            s.add(sum);
        }
        return false;
    }

    // Utility function to insert <key, value> into the multimap
    private static<K, V> void insert(Map<K, List<V>> hashMap, K key, V value)
    {
        // if the key is seen for the first time, initialize the list
        hashMap.putIfAbsent(key, new ArrayList<>());
        hashMap.get(key).add(value);
    }

    // Function to print all subarrays with a zero-sum in a given array
    public static void printAllSubarrays(int[] nums)
    {
        // create an empty multimap to store the ending index of all
        // subarrays having the same sum
        Map<Integer, List<Integer>> hashMap = new HashMap<>();

        // insert (0, -1) pair into the map to handle the case when
        // subarray with zero-sum starts from index 0
        insert(hashMap, 0, -1);
        int sum = 0;

        // traverse the given array
        for (int i = 0; i < nums.length; i++)
        {
            // sum of elements so far
            sum += nums[i];
            // if the sum is seen before, there exists at least one
            // subarray with zero-sum
            if (hashMap.containsKey(sum))
            {
                List<Integer> list = hashMap.get(sum);

                // find all subarrays with the same sum
                for (Integer value: list)
                {
                    System.out.println("Subarray [" + (value + 1) + "…" +
                            i + "]");
                }
            }
            // insert (sum so far, current index) pair into the multimap
            insert(hashMap, sum, i);
        }
    }
}
