public class RecursionSubSequence {
    public static void main(String[] args) {
        allPossibleSubSequences("", "abc");
    }
    static void allPossibleSubSequences(String processed, String unprocessed) {
        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        allPossibleSubSequences(processed+unprocessed.charAt(0), unprocessed.substring(1)); // include the character
        allPossibleSubSequences(processed, unprocessed.substring(1)); // don't include the character
    }
}
// Recursion call parameters tree
//                        ""/abc
//              a/bc                 ""/bc
//      ab/c            a/c             b/c             ""/c
// abc/""   ab/""  ac/""    a/""   bc/""  b/""      c/""    ""/""
