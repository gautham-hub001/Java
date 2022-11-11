import java.util.Scanner;

public class RecursionRemoveAIntheString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a string to remove a occurences: "); // aabcdcstsaAABCdajnsd
        String str1 = scan.nextLine();
        System.out.println(removeAInTheString(str1));

        System.out.print("enter another string: "); // aabcdcstsaAABCdajnsd
        String str2 = scan.nextLine();
        System.out.println(removeStringInTheString(str2));
    }
    static String removeAInTheString(String str) {
        if(str.length() == 0) {
            return "";
        }
        if(str.startsWith("a") || str.startsWith("A")) {
            return removeAInTheString(str.substring(1)); // do not include 'a'
        }
        return str.charAt(0) + removeAInTheString(str.substring(1)); // include 'a'
    }
    static String removeStringInTheString(String str) {
        if(str.length() == 0) {
            return "";
        }
        String match = "abcd";
        if(str.regionMatches(true, 0, match, 0, match.length())) { // thop function: regionMatches
            return removeStringInTheString(str.substring(4));
        }
        return str.charAt(0) + removeStringInTheString(str.substring(1));
    }
}
