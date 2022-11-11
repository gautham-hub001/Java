import java.util.ArrayList;
import java.util.Arrays;

//Note: String pool is a separate memory structure inside heap.
//Note: All similar valued objects are not recreated in the pool.
//Note: If the object value is changed using one of the reference variables,
// it does not affect the values of other reference variables because of immutability.
// Immutability means you cannot change the value of the object. If you try to change it, it just creates another object.
// Note: Integer class is not immutable. And there is no Integer pool.

// Note: + operator is only defined for all the primitives and when one of the operands is a string. => new ArrayList<>() + new Integer(10) gives error.
// But new ArrayList<>() + new Integer(10) + "" does not give error, it gives []10.

// Note: operator overloading is not supported in java(except in the case of strings using + operator to support string concatenation and that too you can't do it).
// But it can be done in C++ and python.
public class Strings {
    public static void main(String[] args) {
        Integer[] a = {1,2,3};
        Integer[] b = a; // b is pointing to the same object as a. So, changes in one object affects the value of the other one too.

        System.out.println(Arrays.toString(a)); // [1, 2, 3]
        System.out.println(Arrays.toString(b)); // [1, 2, 3]

        a[0] = 10;
        System.out.println(Arrays.toString(a)); // [10, 2, 3]
        System.out.println(Arrays.toString(b)); // [10, 2, 3]

        Integer[] c = {1,2,3};
        Integer[] d = {1,2,3}; // c and d are different objects, so changes in object does not affect the value of other object

        System.out.println(Arrays.toString(c)); // [1, 2, 3]
        System.out.println(Arrays.toString(d)); // [1, 2, 3]

        c[0] = 10;
        System.out.println(Arrays.toString(c)); // [10, 2, 3]
        System.out.println(Arrays.toString(d)); // [1, 2, 3]


        String str = "abc"; // garbage collection removes abc from the string pool
        str = "abdf"; // creates a new object
        System.out.println(str);

        // == is comparator. It checks if both the reference variables are pointing to the same object.
        System.out.println(a==b); // true
        System.out.println(c==d); // false

        String str1 = "abc";
        String str2 = "abc";
        // comparison of strings
        System.out.println(str1==str2); //  true

        // Creating two seperate string objects with same value
        String str3 = new String("abc"); // explicitly creates new object, and it is outside the string pool but inside heap
        String str4 = new String("abc");
        System.out.println(str3==str4); // false
        System.out.println(str3.equals(str4)); // true. It only cares about the values of the objects

        System.out.println(str1.charAt(0)); // a

        System.out.println(56); // println calls String.valueOf() which inturn calls Integer.toString()
        System.out.println('a'); // char
        System.out.println("aah"); // String
        System.out.println(Arrays.toString(new int[]{1, 2, 3, 4})); // Object

        Integer i = new Integer(6);
        Integer j = 5;
        System.out.println(i.toString()); // 6
        System.out.println(j.toString()); // 5

        float k = 123.12562f;
        System.out.printf("%.2f", k); // 123.13
        System.out.println();
        System.out.printf("%.4f   %n", Math.PI); // 3.1416
        System.out.printf("dafkjaw: %s,  asjnda: %s  %n", "ABC", "DEF");

        System.out.println('a' + 'b'); // char sum is ascii. 195 (97 + 98)
        System.out.println("a" + "b"); // ab
        System.out.println("a" + 'b'); // if one of them among the + operands is string, the whole thing would be converted to string.

        System.out.println("a" + 2); // integer will be converted to Integer and it will call toString() method => "a" + "2" => a2
        System.out.println('a' + 2); // 97 + 2 => 99
        System.out.println((char) ('a' + 2)); // c
        StringBuilder stringb = new StringBuilder("abc");
        System.out.println(stringb.append("abc")); // append both modifies and returns the string => abcabc
        System.out.println(stringb); // abcabc
        StringBuilder stringc = new StringBuilder("abcd");
        System.out.println(stringb.compareTo(stringc));
        System.out.println("scad" + new ArrayList<>()); // scad[]. For every object, it's toString() will be called

        // Strings are immutable
        // This is bad because of high space complexity.
        // 1(a) + 2(ab) + 3(abc) +.... + N => N(N+1)/2 => O(N^2) space complexity
        String alphabets = "";
        for(i=0; i<26; i++){
            alphabets += (char)('a' + i); // here, new object would be created everytime (a, ab, abc ...)
        }
        System.out.println(alphabets); // abcdefghijklmnopqrstuvwxyz


        // StringBuilder
        // This is better
        // In StringBuilder only one object is made and changes are done to that object only. (StringBuilder objects are mutable)
        StringBuilder sb = new StringBuilder();
        for(i=0; i<26; i++){
            sb.append((char)('a' + i));
        }
        System.out.println(sb); // abcdefghijklmnopqrstuvwxyz

        // append
        sb.append(1);
        System.out.println(sb); // abcdefghijklmnopqrstuvwxyz1
        sb.append(false);
        System.out.println(sb); // abcdefghijklmnopqrstuvwxyz1false
        sb.append("abc", 1, 2); // abcdefghijklmnopqrstuvwxyz1falseb
        System.out.println(sb);

        // insert
        sb.insert(1, "abc", 0, 3);
        System.out.println(sb); // aabcbcdefghijklmnopqrstuvwxyz1falseb

        // compareTo
        int h = sb.compareTo(new StringBuilder("abc")); // we can only compare to StringBuilder objects
        System.out.println(h); // -1

        // delete
        sb.delete(1,4); // deletes characters at index-1,2,3
        System.out.println(sb); // abcdefghijklmnopqrstuvwxyz1falseb

        // deleteCharAt
        sb.deleteCharAt(sb.length()-1); // deletes last char
        System.out.println(sb); // abcdefghijklmnopqrstuvwxyz1false

        //indexOf
        h = sb.indexOf("bcd");
        System.out.println(h); // 1

        h = sb.indexOf("bcd", 2); // searches for bcd from index-2
        System.out.println(h); // -1

        // lastIndexOf
        System.out.println(sb.lastIndexOf("f")); // 27

        // replace
        sb.replace(1,sb.length(),"A");
        System.out.println(sb); // aA

        // charAt
        System.out.println(sb.charAt(0));

        // reverse
        sb.reverse();
        System.out.println(sb); // Aa

        System.out.println(sb.capacity()); // 70

        System.out.println(sb.isEmpty()); // false

        System.out.println(sb.length()); // 2

        // subSequence returns CharSequence which is an interface
        sb.append("BCD");
        System.out.println(sb); // AaBCD
        CharSequence s = sb.subSequence(0,2);
        System.out.println(s); // Aa

        // IMPPP
        // substring returns String (which actually implements CharSequence). So, it can be assigned to both CharSequence object or String object
        s = sb.substring(0); // assigned to CharSequence object
        System.out.println(s); // AaBCD

        String ss = sb.substring(0,2); // assigned to String object
        System.out.println(ss); // Aa

        System.out.println(sb.equals("AaBCD")); // false

        // IMP methods of String class
        String st = "this is chararray";

        // toCharArray
        char[] ch = st.toCharArray();
        System.out.println(ch); // this is chararray
        System.out.println(Arrays.toString(ch)); // [t, h, i, s,  , i, s,  , c, h, a, r, a, r, r, a, y]

        // toUpperCase
        // It does not change the object bcoz it creates a new object
        System.out.println(st.toUpperCase()); // THIS IS CHARARRAY
        System.out.println(st); // this is chararray

        // indexOf
        System.out.println(st.indexOf('i')); // 2

        // strip
        System.out.println("      jnjas nfdaji    ".strip()); // jnjas nfdaji

        // split
        // It returns String[]. So, Arrays.toString() needs to be used.
        System.out.println(Arrays.toString(st.split(" "))); // [this, is, chararray]
        System.out.println(Arrays.toString(st.split(" ", 2))); // [this, is chararray]. Only 2 Strings need to be returned

    }
}
