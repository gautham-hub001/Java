package Problems;

public class ZigZagConversion {

//    The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
// This is only for readability.
//    P   A   H   N
//    A P L S I I G
//    Y   I   R
//    And then read line by line: "PAHNAPLSIIGYIR"
//    In actual StringBuilder array, we will store like this.
//    PAHN
//    APLSIIG
//    YIR
//
    public static String convert(String s, int numRows) {
        if(numRows == 1) {
            return s;
        }

        // Declare stringbuilder array
        StringBuilder[] ans = new StringBuilder[numRows];
        // For stringBuilder arrays, we always need to initialize each object
        for (int i = 0; i < numRows; i++) {
            ans[i] = new StringBuilder("");
        }

        int step=1, listIndex=0;
        for(int i=0; i<s.length(); i++) {
            ans[listIndex].append(s.charAt(i));
            if(listIndex==0) {
                step=1;
            }
            else if(listIndex==numRows-1) {
                step=-1;
            }
            listIndex += step;
        }
        // Concatenate all the strings
        for(int i =1; i<numRows; i++){
            ans[0].append(ans[i]);
        }
        return ans[0].toString();
    }


    public static void main(String[] args) {
        System.out.println(convert(new String("PAYPALISHIRING"), 3)); // PAHNAPLSIIGYIR
    }
}
