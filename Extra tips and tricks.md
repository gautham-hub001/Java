String str1 = "abcdcstsaAABCdajnsd";
String str2 = "aBcdjasnfi";

boolean match1 = str1.regionMatches(true, 0, str2, 0, 4); // params: ignoreCase, start Index of str1, str2, start Index of str2, length of match we're checking
System.out.println(match1); // true

// convert int to string
String num = String.valueOf(n);