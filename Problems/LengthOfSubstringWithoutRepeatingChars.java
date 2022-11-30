package Problems;
import java.util.Set;
import java.util.HashSet;

public class LengthOfSubstringWithoutRepeatingChars {
    // bruteforce
    public static int lengthOfLongestSubstring(String s) {
        int maxlength= 0;
        for(int i=0; i<s.length(); i++) {
            for(int j=i; j<s.length(); j++) {
                Set<Character> myset = new HashSet<>(); // for checking if all the chars between i and j are unique
                for(int k=i; k<=j; k++) { // add all the chars from i to j
                    myset.add(s.charAt(k));
                }
                if(j-i+1 == myset.size()) { // unique
                    maxlength = Math.max(maxlength, myset.size()); // only update the maxlength if all chars between i and j are unique
                }
            }
        }
        return maxlength;
    }

    // using sliding window
    // In this technique, we never have the current character's previous frequency(in the window) more than 1.
    // So, it doesn't matter if we use HashSet or HashMap
    // since the frequency is always 1. So, it is better to use HashSet.
    public static int sliding(String s) {
        int j = 0, maxlength = 0;
        Set<Character> hs = new HashSet<>();
        for(int i=0; i<s.length(); i++) {
            // if current char is present in the hash set remove all the characters till that char, including that char.
            while(hs.contains(s.charAt(i))) {
                hs.remove(s.charAt(j));
                j++;
            }
            hs.add(s.charAt(i));
            maxlength = Math.max(maxlength, i-j+1);
        }
        return maxlength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // abc -> 3
        System.out.println(sliding("abcabcbb")); // abc -> 3
    }
}