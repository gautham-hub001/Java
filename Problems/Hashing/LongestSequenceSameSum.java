package Problems.Hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSequenceSameSum {
    static void solution(int[] X, int[] Y) {
        int cumulativeSumX = 0, cumulativeSumY = 0, max_len = 1;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0,-1);

        for(int i=0; i<X.length; i++) {
            cumulativeSumX += X[i];
            cumulativeSumY += Y[i];
            int diff = cumulativeSumX - cumulativeSumY;
            m.putIfAbsent(diff, i);
            if(i - m.get(diff) > max_len) {
                max_len = i - m.get(diff);
            }
        }
        System.out.println(max_len);
    }
    public static void main(String[] args) {
        int[] X = { 0, 0, 1, 1, 1, 1 };
        int[] Y = { 0, 1, 1, 0, 1, 0 };
        solution(X,Y);
    }
}
