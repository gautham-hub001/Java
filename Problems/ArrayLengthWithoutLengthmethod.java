package Problems;

public class ArrayLengthWithoutLengthmethod {
    static int length(String s) {
        int i = 0;
        for(char c: s.toCharArray()) {
            i++;
        }
        return i;
    }
    public static int getLengthOfString(String str)
    {
        int i=0;
        try{
            for(i=0;;i++) {
                str.charAt(i);
            }
        }
        catch(Exception e)
        {
        }
        return i;
    }
    public static void main(String[] args) {
        System.out.println(length("abcd"));
        System.out.println(length(""));
        System.out.println(getLengthOfString("abcd"));
        System.out.println(getLengthOfString(""));
    }
}
