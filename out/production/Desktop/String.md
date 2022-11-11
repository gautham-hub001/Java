Note: All objects will be created in the heap.

String str1 = "abcdcstsaAABCdajnsd";
String str2 = "aBcdjasnfi";
Datatype reference_var = Object


String a = "water";
String b = "water";

a,b point to the same object

Reference variables (a,b) will be stored in stack and objects will be stored in string pool which is in heap.



boolean match1 = str1.regionMatches(true, 0, str2, 0, 4); // params: ignoreCase, start Index of str1, str2, start Index of str2, length of match we're checking
System.out.println(match1); // true

// convert int to string
String num = String.valueOf(n);

Note: new keyword creates objects outside the pool but inside the heap