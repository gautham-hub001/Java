package Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubArrayZeroSumExists {
    public static void main(String []args) {
        int[] arr = { 4, -6, 3, -1, 4, 2, 7 };
        System.out.println(subArrayZeroSum(arr));
//        System.out.println(a);
        System.out.println(Arrays.toString(arr));
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
}
