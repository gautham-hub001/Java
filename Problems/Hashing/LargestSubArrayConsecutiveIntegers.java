package Problems.Hashing;

// For largest, we maintain maxlen variable
// For consecutive elements sub array:
// 1. max element - min element in the sub array should be = ending index - starting index of the sub array
// 2. And the elements should be distinct -> using visited array

// https://www.techiedelight.com/find-largest-sub-array-formed-by-consecutive-integers/
public class LargestSubArrayConsecutiveIntegers {
    static boolean isConsecutive(int[] arr, int i, int j, int min_elem, int max_elem) {
        if(max_elem - min_elem != j-i) {
            return false;
        }

        boolean[] visited = new boolean[j-i+1];
        for(int k = i; k<=j; k++) {
            if(visited[arr[k] - min_elem]) {
                return false;
            }
            visited[arr[k] - min_elem] = true;
        }
        return true;
    }
    static void findMaxSubArray(int[] arr) {
        int maxLen = 1, start_index = 0, end_index = 0;
        for(int i=0; i < arr.length - 1; i++) {
            int min_elem = arr[i], max_elem = arr[i];
            for(int j = i+1; j < arr.length; j++) {
                min_elem = (min_elem < arr[j]) ? min_elem : arr[j];
                max_elem = (max_elem < arr[j]) ? arr[j] : max_elem;
                if(isConsecutive(arr, i, j, min_elem, max_elem)) {
                    if(maxLen < j-i+1) {
                        maxLen = j-i+1;
                        start_index = i;
                        end_index = j;
                    }
                }
            }
        }
        System.out.println("length: " + maxLen + "-> [" + start_index + ", " + end_index + "]");
    }
    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 4, 3, 1, 0 };
        findMaxSubArray(arr);
    }
}
