import java.util.regex.Matcher;
import java.util.regex.Pattern;

// https://www.javatpoint.com/java-regex

public class RegEx {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("Visit W3Schools!");
        boolean matchFound = m.find(); // find() returns true even if part of the string matches the pattern
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

        // matches() returns true if entire string matches the pattern. So, it implicitly adds ^ at the beginning and $ at the end.
        boolean b2= Pattern.compile(".s").matcher("as").matches();
        System.out.println(b2);
        System.out.println();

        // matches() vs find()
        // find() - substring
        // matches() - entire string
        Pattern p1 = Pattern.compile("\\d\\d\\d");
        Matcher m1 = p1.matcher("a123b");
        System.out.println(m1.find());
        System.out.println(m1.matches());
        System.out.println();

        // ^ denotes beginning when it is not inside []. When it is inside [], it denotes negation
        p = Pattern.compile("^\\d\\d\\d$");
        m = p.matcher("123");
        System.out.println(m.find());
        System.out.println(m.matches());
        System.out.println();

        // easiest way to use matches()
        System.out.println(Pattern.matches(".s", "as"));

        System.out.println(Pattern.matches("[amn]", "a"));
        System.out.println(Pattern.matches("[a-z&&[^m-p]]", "m")); // a to z and not m to p
        System.out.println(Pattern.matches("a-z&&[^m-p]", "a")); // same as above one
        System.out.println(Pattern.matches("[amn]?", "a")); //true (a or m or n comes one time)  ? -> 0 or 1 time
        System.out.println(Pattern.matches("[amn]?", "")); //true (a or m or n comes one time)  ? -> 0 or 1 time
        System.out.println(Pattern.matches("[amn]+", "aaammnaamm")); //true (a or m or n once or more times)
        System.out.println(Pattern.matches("[amn]*", "")); //true (a or m or n may come zero or more times)

        // \\d is digit
        System.out.println(Pattern.matches("\\d", "abc")); //false (non-digit)
        System.out.println(Pattern.matches("\\d", "1")); //true (digit and comes once)
        System.out.println(Pattern.matches("\\d", "4443")); //false (digit but comes more than once)
        System.out.println(Pattern.matches("\\d", "323abc")); //false (digit and char)

        // capitals are for negation of normal one
        // \\D is non-digit
        System.out.println(Pattern.matches("\\D", "1")); //false (digit)
        System.out.println(Pattern.matches("\\D", "m")); //true (non-digit and comes once)
        System.out.println(Pattern.matches("\\D", "4443")); //false (digit)
        System.out.println(Pattern.matches("\\D", "323abc")); //false (digit and char)
        System.out.println(Pattern.matches("\\D*", "mak"));//true


        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true. Alphanumeric characters of length exactly 6
        System.out.println();


        // indexes of matching in the string
        Pattern p2 = Pattern.compile("java");
        Matcher matcher = p2.matcher("this is java, do you know java");
        boolean found = false;
        while (matcher.find()) {
            System.out.println("text found: "+matcher.group()+" starting index: "+
                    matcher.start()+" ending index: "+matcher.end());
            found = true;
        }
        if(!found){
            System.out.println("No match found.");
        }
    }
}